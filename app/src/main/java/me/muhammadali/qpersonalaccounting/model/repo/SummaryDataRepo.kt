package me.muhammadali.qpersonalaccounting.model.repo

import me.muhammadali.qpersonalaccounting.model.DailyReportSearch
import me.muhammadali.qpersonalaccounting.model.MonthlyReportSearch
import me.muhammadali.qpersonalaccounting.model.ReportSearch
import me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO
import io.reactivex.Flowable

class SummaryDataRepo(private val dao: SummaryDataDao) {

    fun getTotalIncome() = dao.findTotalIncome()

    fun getTotalExpense() = dao.findTotalExpense()

    fun getExpenseSummary() = dao.findExpenseSummary()

    fun getReportSummary(search: ReportSearch): Flowable<List<EntryDataVO>> {
        return when (search) {
            is DailyReportSearch -> when (search.type) {
                Category.Type.EXPENSE -> dao.findExpenseSummary(search.issueDate)
                Category.Type.INCOME -> dao.findIncomeSummary(search.issueDate)
            }

            is MonthlyReportSearch -> when (search.type) {
                Category.Type.EXPENSE -> dao.findExpenseSummary(search.yearMonth.year, search.yearMonth.monthOfYear)
                Category.Type.INCOME -> dao.findIncomeSummary(search.yearMonth.year, search.yearMonth.monthOfYear)
            }
            else -> Flowable.empty()
        }
    }

    fun getCategorySummary(search: ReportSearch): Flowable<List<CategoryWithAmountVO>> {
        return when (search) {
            is DailyReportSearch -> dao.findCategoriesWithAmountByTypeAndDate(search.type, search.issueDate)
            is MonthlyReportSearch -> dao.findCategoriesWithAmountByTypeAndMonth(search.type, search.yearMonth.year, search.yearMonth.monthOfYear)
            else -> Flowable.empty()
        }
    }

    fun getTimelyExpenseSummary(year: Int) = dao.findTimelyExpenseSummary(year)

}