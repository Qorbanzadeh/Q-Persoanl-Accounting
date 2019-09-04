package me.muhammadali.qpersonalaccounting.model

import me.muhammadali.qpersonalaccounting.model.entity.Category
import org.joda.time.LocalDate
import org.joda.time.YearMonth

interface ReportSearch {
    var type: Category.Type
}
data class DailyReportSearch(
    override var type: Category.Type,
    var issueDate: LocalDate): ReportSearch
data class MonthlyReportSearch(
    override var type: Category.Type,
    var yearMonth: YearMonth): ReportSearch