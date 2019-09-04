package me.muhammadali.qpersonalaccounting.ui.cashentry

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.CashEntrySearch
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.vo.GroupingVO
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDate

class CashEntriesViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = ServiceLocator.instance(application).cashEntryRepo
    private val compositeDisposable = CompositeDisposable()

    var search = CashEntrySearch()

    val entries = MutableLiveData<PagedList<GroupingVO>>()
    val operation = MutableLiveData<Boolean>()
    val error = MutableLiveData<String>()

    fun search(from: LocalDate?, to: LocalDate?, type: Category.Type) {
        search.from = from
        search.to = to
        search.type = type
        refresh()
    }

    fun search(type: Category.Type) {
        if (search.from != null && search.to != null) {
            search.type = type
            refresh()
        }
    }

    fun searchFrom(from: LocalDate) {
        search.from = from
        refresh()
    }

    fun searchTo(to: LocalDate) {
        search.to = to
        refresh()
    }

    fun delete(entryId: Long, type: Category.Type) {
        val disposable = repo.delete(entryId, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    operation.value = true
                }, {
                   error.value = getApplication<Application>().getString(R.string.entry_delete_error)
                })
        compositeDisposable.add(disposable)
    }

    fun refresh() {
        val disposable = repo.getCashEntryWithCategory(search)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { entries.value = it }
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}