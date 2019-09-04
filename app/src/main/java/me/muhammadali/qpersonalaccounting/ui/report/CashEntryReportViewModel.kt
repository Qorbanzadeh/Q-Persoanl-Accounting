package me.muhammadali.qpersonalaccounting.ui.report

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.DailyReportSearch
import me.muhammadali.qpersonalaccounting.model.MonthlyReportSearch
import me.muhammadali.qpersonalaccounting.model.ReportSearch
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.model.repo.SummaryDataRepo
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDate
import org.joda.time.YearMonth

class CashEntryReportViewModel(application: Application) : AndroidViewModel(application) {

    private val repo: SummaryDataRepo = ServiceLocator.instance(application).summaryDataRepo

    private val compositeDisposable = CompositeDisposable()

    var reportSearch: ReportSearch? = null

    val summary = MutableLiveData<List<EntryDataVO>>()

    val uses = MutableLiveData<List<CategoryWithAmountVO>>()

    fun search() {
        reportSearch?.also {
            val disposableReport = repo.getReportSummary(it)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        summary.value = it
                    }

            val disposableCategory = repo.getCategorySummary(it)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        uses.value = it
                    }

            compositeDisposable.addAll(disposableReport, disposableCategory)
        }
    }

    fun search(type: Category.Type) {
        reportSearch?.type = type
        search()
    }

    fun search(issueDate: LocalDate) {
        (reportSearch as? DailyReportSearch)?.issueDate = issueDate
        search()
    }

    fun search(yearMonth: YearMonth) {
        (reportSearch as? MonthlyReportSearch)?.yearMonth = yearMonth
        search()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}