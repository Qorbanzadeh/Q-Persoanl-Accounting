package me.muhammadali.qpersonalaccounting.util

import android.text.format.DateUtils
import org.joda.time.LocalDate
import org.joda.time.YearMonth
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

fun LocalDate.toDefaultFormat(): String {
    val sdf = SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)
    return if (DateUtils.isToday(this.toDate().time)) "Today" else sdf.format(this.toDate())
}

fun YearMonth.toDefaultFormat(): String {
    return if (monthOfYear == YearMonth.now().monthOfYear) "This month" else toString("MMM yyyy")
}

fun Double.toFractionString(): String {
    val df = DecimalFormat("###,###.###")
    return df.format(this)
}
