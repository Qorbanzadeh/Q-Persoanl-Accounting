package me.muhammadali.qpersonalaccounting.ui.cashentry

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.entity.CashEntry
import me.muhammadali.qpersonalaccounting.model.entity.Category
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class EditCashEntryViewModel(application: Application) : AndroidViewModel(application) {

    private val entryRepo = ServiceLocator.instance(application).cashEntryRepo
    private val categoryRepo = ServiceLocator.instance(application).categoryRepo
    private val compositeDisposable = CompositeDisposable()

    var type = Category.Type.EXPENSE

    val entry = MutableLiveData<CashEntry>()
    val categories = MutableLiveData<List<Category>>()
    val category = MutableLiveData<Category>()

    val operation = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()
    val titleError = MutableLiveData<String?>()
    val amountError = MutableLiveData<String?>()
    val categoryError = MutableLiveData<String?>()

    fun init(id: Long) {
        val disposable = entryRepo.getCashEntry(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterSuccess { findCategory(it.categoryId) }
                .subscribe({
                    entry.value = it
                }, {
                    entry.value = CashEntry()
                    findCategories()
                })
        compositeDisposable.add(disposable)
    }

    fun save() {
        entry.value?.categoryId = category.value?.id ?: 0
        if (isValid) {
            val disposable = entryRepo.save(entry.value!!, type)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        operation.value = true
                    }, {
                        error.value = getApplication<Application>().getString(R.string.entry_save_error)
                    })
            compositeDisposable.add(disposable)
        }
    }

    fun delete() {
        val disposable = entryRepo.delete(entry.value!!, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    operation.value = true
                }, {
                    error.value = getApplication<Application>().getString(R.string.entry_delete_error)
                })
        compositeDisposable.add(disposable)
    }

    fun onTypeSelect(type: Category.Type) {
        this.type = type
        findCategories()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    private fun findCategory(id: Int) {
        val disposable = categoryRepo.getCategory(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterSuccess { findCategories() }
                .subscribe { c ->
                    category.value = c
                }

        compositeDisposable.add(disposable)
    }

    private fun findCategories() {
        val disposable = categoryRepo.getCategoriesByType(type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    categories.value = it
                }
        compositeDisposable.add(disposable)
    }

    private val isValid: Boolean
        get() = entry.value?.let {
            var valid = true
            if (it.title.isEmpty()) {
                titleError.value = getApplication<Application>().getString(R.string.entry_title_require)
                valid = false
            } else {
                titleError.value = null
            }

            if (it.amount <= 0.0) {
                amountError.value = getApplication<Application>().getString(R.string.entry_amount_require)
                valid = false
            } else {
                amountError.value = null
            }

            if (it.categoryId == 0) {
                categoryError.value = getApplication<Application>().getString(R.string.entry_category_require)
                valid = false
            } else {
                categoryError.value = null
            }

            return@let valid
        } ?: false
}