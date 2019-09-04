package me.muhammadali.qpersonalaccounting.ui.category

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class EditCategoryViewModel(application: Application) : AndroidViewModel(application) {

    private val repo: CategoryRepo = ServiceLocator.instance(application).categoryRepo
    private val compositeDisposable = CompositeDisposable()

    val category = MutableLiveData<Category>()
    val operation = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()
    val nameError = MutableLiveData<String?>()

    fun init(id: Int) {
        val disposable = repo.getCategory(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    category.value = it
                }, {
                    category.value = Category()
                })

        compositeDisposable.add(disposable)
    }

    fun save() {
        if (isValid) {
            val disposable = repo.save(category.value!!)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        operation.value = true
                    }, {
                        error.value = getApplication<Application>().getString(R.string.category_save_error)
                    })
            compositeDisposable.add(disposable)
        }
    }

    fun delete() {
        val disposable = repo.delete(category.value!!)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    operation.value = true
                }, {
                    error.value = getApplication<Application>().getString(R.string.category_delete_error)
                })
        compositeDisposable.add(disposable)
    }

    fun onTypeSelect(type: Category.Type) {
        category.value?.type = type
    }

    fun onColorCheck(isChecked: Boolean, color: String) {
        if (isChecked) {
            category.value?.color = color
        }
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    private val isValid: Boolean
        get() = category.value?.let {
            if (it.name.isEmpty()) {
                nameError.value = getApplication<Application>().getString(R.string.category_name_require)
                return@let false
            } else {
                nameError.value = null
            }
            return@let true
        } ?: false

}