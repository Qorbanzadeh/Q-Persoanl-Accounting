package me.muhammadali.qpersonalaccounting.vo

import me.muhammadali.qpersonalaccounting.util.toFractionString
import org.joda.time.LocalDate

data class CashEntryWithCategoryVO(
        var id: Long,
        var title: String,
        var date: LocalDate,
        var amount: Double,
        var color: String,
        var category: String
) : GroupingVO {
    constructor() : this(0, "", LocalDate.now(), 0.0, "#a2a2a2", "")

    val shortName: String
        get() = category.toUpperCase().take(2)

    val _amount: String
        get() = if (amount > 0) amount.toFractionString() else ""
}