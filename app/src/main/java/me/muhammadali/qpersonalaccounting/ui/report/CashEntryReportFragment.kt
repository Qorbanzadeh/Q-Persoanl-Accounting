package me.muhammadali.qpersonalaccounting.ui.report

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.*
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.github.mikephil.charting.components.Legend
import com.google.android.material.appbar.AppBarLayout
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.model.DailyReportSearch
import me.muhammadali.qpersonalaccounting.model.MonthlyReportSearch
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.ui.ChartDataHelper
import me.muhammadali.qpersonalaccounting.ui.MonthPickerDialog
import me.muhammadali.qpersonalaccounting.ui.category.CategoryWithAmountAdapter
import me.muhammadali.qpersonalaccounting.util.toDefaultFormat
import me.muhammadali.qpersonalaccounting.util.toFractionString
import kotlinx.android.synthetic.main.fragment_cashentry_report.*
import kotlinx.android.synthetic.main.layout_appbar_with_spinner.*
import org.joda.time.LocalDate
import org.joda.time.YearMonth

class CashEntryReportFragment : Fragment() {

    companion object {
        const val KEY_REPORT_TYPE = "report_type"
    }

    private lateinit var viewModel: CashEntryReportViewModel
    private val chartDataHelper by lazy { ChartDataHelper() }
    private val adapter by lazy { CategoryWithAmountAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[CashEntryReportViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cashentry_report, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity
        val params = toolbar.layoutParams as AppBarLayout.LayoutParams
        params.scrollFlags = 0

        activity.setSupportActionBar(toolbar)
        activity.supportActionBar?.setDisplayShowTitleEnabled(false)
        activity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        activity.supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white)

        toolbarSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView<*>?, v: View?, i: Int, l: Long) {
                val type = Category.Type.values()[i]
                viewModel.search(type)
            }
        }

        recyclerView.apply {
            setHasFixedSize(true)
            //addItemDecoration(PaddedDividerItemDecoration(0, context))
            adapter = this@CashEntryReportFragment.adapter
        }

        usageChart.setNoDataTextColor(Color.DKGRAY)
        usageChart.setDrawEntryLabels(false)
        usageChart.setUsePercentValues(true)
        usageChart.description.isEnabled = false
        usageChart.extraRightOffset = 48f
        usageChart.legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        usageChart.legend.orientation = Legend.LegendOrientation.VERTICAL
        usageChart.legend.horizontalAlignment = Legend.LegendHorizontalAlignment.RIGHT
        usageChart.legend.direction = Legend.LegendDirection.LEFT_TO_RIGHT

        val reportType = arguments?.getInt(KEY_REPORT_TYPE, 0) ?: 0

        tvDate.text = if (reportType == 0) "Today" else "This Month"
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_date, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                findNavController().navigateUp()
                return true
            }
            R.id.action_date -> {
                when (val search = viewModel.reportSearch) {
                    is DailyReportSearch -> {
                        val issueDate = search.issueDate
                        val dialog = DatePickerDialog(context!!, R.style.AppTheme_Dialog,
                            DatePickerDialog.OnDateSetListener { _, y, m, d ->
                                val date = LocalDate(y, m + 1, d)
                                viewModel.search(date)
                                tvDate.text = date.toDefaultFormat()
                            }, issueDate.year, issueDate.monthOfYear - 1, issueDate.dayOfMonth)

                        dialog.show()
                    }

                    is MonthlyReportSearch -> {
                        val yearMonth = search.yearMonth

                        val dialog = MonthPickerDialog(context!!, {y, m ->
                            val ym = YearMonth(y, m)
                            viewModel.search(ym)
                            tvDate.text = ym.toDefaultFormat()
                        }, yearMonth.year, yearMonth.monthOfYear)

                        dialog.show()
                    }
                }

                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.summary.observe(this, Observer {
            if (it.isNotEmpty()) {
                val pieData = chartDataHelper.setupPieChartData(it)
                pieData.setValueTextSize(10f)
                usageChart.data = pieData
                usageChart.centerText = "Total\n${it.sumByDouble { vo -> vo.amount }.toFractionString()}"
                usageChart.invalidate()
                usageChart.animateXY(1000, 1000)
            } else {
                usageChart.data = null
                usageChart.invalidate()
            }
        })

        viewModel.uses.observe(this, Observer {
            adapter.submitList(it)
        })

        Handler().postDelayed({
            val reportType = arguments?.getInt(KEY_REPORT_TYPE, 0) ?: 0

            viewModel.reportSearch = if (reportType == 0) {
                DailyReportSearch(Category.Type.EXPENSE, LocalDate.now())
            } else {
                MonthlyReportSearch(Category.Type.EXPENSE, YearMonth.now())
            }

            viewModel.search()
        }, 500)

    }

}