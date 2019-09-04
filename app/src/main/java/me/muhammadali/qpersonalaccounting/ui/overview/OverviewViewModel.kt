package me.muhammadali.qpersonalaccounting.ui.overview

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO
import me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class OverviewViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = ServiceLocator.instance(application).summaryDataRepo
    private val compositeDisposable = CompositeDisposable()

    val totalIncome = MutableLiveData<Double>()

    val totalExpense = MutableLiveData<Double>()

    val expenseSummary = MutableLiveData<List<EntryDataVO>>()

    val timelyExpenseSummary = MutableLiveData<List<TimelyEntryDataVO>>()


    init {
        val disposableTotalIncome = repo.getTotalIncome()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { totalIncome.value = it }

        val disposableTotalExpense = repo.getTotalExpense()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { totalExpense.value = it }

        val disposableExpenseSummary = repo.getExpenseSummary()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { expenseSummary.value = it }

        compositeDisposable.addAll(disposableTotalIncome, disposableTotalExpense, disposableExpenseSummary)
    }

    fun searchTimelyExpenseSummary(year: Int) {
        val disposable = repo.getTimelyExpenseSummary(year)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { timelyExpenseSummary.value = it }
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}