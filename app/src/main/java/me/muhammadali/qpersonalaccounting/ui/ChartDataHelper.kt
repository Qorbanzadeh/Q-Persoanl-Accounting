package me.muhammadali.qpersonalaccounting.ui

import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.utils.ColorTemplate
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO
import me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO

class ChartDataHelper {

    fun setupPieChartData(list: List<EntryDataVO>): PieData {
        val entries = arrayListOf<PieEntry>()
        val colors = arrayListOf<Int>()

        for (en in list) {
            entries.add(PieEntry(en.amount.toFloat(), en.category))
            colors.add(ColorTemplate.rgb(en.color))
        }

        val dataSet = PieDataSet(entries, "")
        dataSet.sliceSpace = 3f
        dataSet.colors = colors
        dataSet.selectionShift = 0f
        dataSet.yValuePosition = PieDataSet.ValuePosition.OUTSIDE_SLICE
        dataSet.valueLinePart1OffsetPercentage = 100f
        dataSet.valueLinePart1Length = 0.4f
        dataSet.valueLinePart2Length = 0.45f
        dataSet.valueFormatter = PercentValueFormatter()

        return PieData(dataSet)
    }

    fun setupBarChartData(list: List<EntryDataVO>): BarData {
        val entries = arrayListOf<BarEntry>()
        val colors = arrayListOf<Int>()

        var i = 1f
        for (en in list) {
            entries.add(BarEntry(i, en.amount.toFloat()))
            colors.add(ColorTemplate.rgb(en.color))
            i += 1f
        }

        val dataSet = BarDataSet(entries, "Categories")
        dataSet.colors = colors
        dataSet.isHighlightEnabled = false

        return BarData(dataSet)
    }

    fun setupLineChartData(list: List<TimelyEntryDataVO>): LineData {
        val map = list.map { it.time to it }.toMap()
        val entries = arrayListOf<Entry>()

        for (i in 1..12) {
            val vo = map[i]
            if (vo != null) {
                entries.add(Entry(i.toFloat(), vo.amount.toFloat()))
            } else {
                entries.add(Entry(i.toFloat(), 0f))
            }
        }

        val color = ColorTemplate.rgb("#2196f3")
        val dataSet = LineDataSet(entries, "")
        dataSet.color = color
        dataSet.setCircleColor(color)
        dataSet.fillColor = color
        //dataSet.setDrawFilled(true)
        dataSet.setDrawVerticalHighlightIndicator(false)
        dataSet.setDrawHorizontalHighlightIndicator(false)
        dataSet.fillAlpha = 150
        dataSet.lineWidth = 3f
        dataSet.circleRadius = 4f
        dataSet.mode = LineDataSet.Mode.HORIZONTAL_BEZIER

        return LineData(dataSet)
    }

}