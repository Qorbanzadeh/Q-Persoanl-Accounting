package me.muhammadali.qpersonalaccounting.ui

import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.formatter.IValueFormatter
import com.github.mikephil.charting.utils.ViewPortHandler
import java.math.RoundingMode
import java.text.DecimalFormat

class PercentValueFormatter : IValueFormatter {
    override fun getFormattedValue(
        value: Float,
        entry: Entry?,
        dataSetIndex: Int,
        viewPortHandler: ViewPortHandler?
    ): String {
        val df = DecimalFormat("###,###.#")
        df.roundingMode = RoundingMode.FLOOR
        return "${df.format(value)} %"
    }

}