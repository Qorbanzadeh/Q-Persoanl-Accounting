package me.muhammadali.qpersonalaccounting.ui.category

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class CategoriesViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = ServiceLocator.instance(application).categoryRepo

    private val compositeDisposable = CompositeDisposable()

    val categories = MutableLiveData<List<CategoryWithAmountVO>>()
    val error = MutableLiveData<String>()

    fun search(type: Category.Type) {
        val disposable = repo.getCategoriesWithAmountByType(type)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                categories.value = it
            }

        compositeDisposable.add(disposable)
    }

    fun delete(categoryId: Int) {
        val disposable = repo.delete(categoryId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                }, {
                    error.value = getApplication<Application>().getString(R.string.category_delete_error)
                })
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}