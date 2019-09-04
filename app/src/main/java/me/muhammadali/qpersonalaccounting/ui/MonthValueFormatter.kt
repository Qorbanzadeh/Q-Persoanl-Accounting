package me.muhammadali.qpersonalaccounting.ui

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter
import java.text.DateFormatSymbols

class MonthValueFormatter : IAxisValueFormatter {

    override fun getFormattedValue(value: Float, axis: AxisBase?): String {
        return DateFormatSymbols.getInstance().shortMonths[value.toInt() - 1]
    }

}