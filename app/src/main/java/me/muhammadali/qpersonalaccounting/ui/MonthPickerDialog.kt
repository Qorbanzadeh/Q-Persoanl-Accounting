package me.muhammadali.qpersonalaccounting.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ui.custom.RadioTextButton
import kotlinx.android.synthetic.main.layout_month_picker.*
import org.joda.time.YearMonth
import java.text.DateFormatSymbols

class MonthPickerDialog(
    context: Context,
    onMonthSelectedListener: ((Int, Int) -> Unit),
    private var year: Int,
    private var month: Int
) : AlertDialog(context) {

    private var onMonthSelectedListener: ((Int, Int) -> Unit)? = onMonthSelectedListener
    private var selectedYear = year

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_month_picker)

        refreshYearMonth()
        checkCurrentMonth()
        tvYear.text = year.toString()

        for (id in monthGroup.referencedIds) {
            val rb = findViewById<RadioTextButton>(id)
            rb?.setOnClickListener {
                month = it.tag.toString().toInt()
                selectedYear = year
                checkCurrentMonth()
                refreshYearMonth()
            }
        }

        btnDec.setOnClickListener {
            year -= 1
            tvYear.text = year.toString()
            checkCurrentMonth()

        }

        btnInc.setOnClickListener {
            year += 1
            tvYear.text = year.toString()
            checkCurrentMonth()
        }

        btnCancel.setOnClickListener { dismiss() }

        btnOk.setOnClickListener {
            onMonthSelectedListener?.invoke(selectedYear, month)
            dismiss()
        }

    }

    private fun checkCurrentMonth() {
        val cur = YearMonth.now()

        for (id in monthGroup.referencedIds) {
            val rb = findViewById<RadioTextButton>(id)
            rb?.isModifier = (year == cur.year && cur.monthOfYear == rb?.tag.toString().toInt())
            rb?.isChecked = (selectedYear == year && month == rb?.tag.toString().toInt())
            rb?.invalidate()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun refreshYearMonth() {
        tvYearMonth.text = "${DateFormatSymbols.getInstance().shortMonths[month - 1]}, $selectedYear"
    }

}