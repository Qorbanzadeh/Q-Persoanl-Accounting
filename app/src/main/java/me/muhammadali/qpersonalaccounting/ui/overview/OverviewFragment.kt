package me.muhammadali.qpersonalaccounting.ui.overview

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.github.mikephil.charting.components.XAxis
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.ui.BaseNavigationFragment
import me.muhammadali.qpersonalaccounting.ui.ChartDataHelper
import me.muhammadali.qpersonalaccounting.ui.MonthValueFormatter
import me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryFragment
import me.muhammadali.qpersonalaccounting.util.toFractionString
import kotlinx.android.synthetic.main.fragment_overview.*
import kotlinx.android.synthetic.main.layout_appbar.*
import org.joda.time.DateTime

class OverviewFragment : BaseNavigationFragment() {

    private lateinit var viewModel: OverviewViewModel
    private val chartDataHelper by lazy { ChartDataHelper() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[OverviewViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_overview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.setTitle(R.string.title_overview)

        expenseBarChart.setNoDataTextColor(Color.DKGRAY)
        expenseBarChart.description.isEnabled = false
        expenseBarChart.xAxis.setDrawLabels(false)
        expenseBarChart.xAxis.setDrawGridLines(false)
        expenseBarChart.xAxis.setDrawAxisLine(false)
        expenseBarChart.axisLeft.setDrawAxisLine(false)
        expenseBarChart.axisRight.setDrawLabels(false)
        expenseBarChart.axisRight.setDrawAxisLine(false)

        expenseLineChart.setNoDataTextColor(Color.DKGRAY)
        expenseLineChart.description.isEnabled = false
        expenseLineChart.legend.isEnabled = false
        expenseLineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        expenseLineChart.xAxis.setDrawGridLines(false)
        expenseLineChart.xAxis.setDrawAxisLine(false)
        expenseLineChart.axisLeft.setDrawAxisLine(false)
        expenseLineChart.axisRight.setDrawLabels(false)
        expenseLineChart.axisRight.setDrawAxisLine(false)
        //expenseLineChart.xAxis.setLabelCount(12, true)
        expenseLineChart.xAxis.valueFormatter = MonthValueFormatter()
        expenseLineChart.setDrawMarkers(false)

        val size = DateTime.now().year - 2015
        val years = Array(size) { it -> DateTime.now().year.minus(it) }
        val yearAdapter = ArrayAdapter<Int>(context!!, R.layout.layout_simple_list_item_1, years)

        spinnerYears.adapter = yearAdapter
        spinnerYears.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView<*>?, v: View?, i: Int, l: Long) {
                (adapterView?.getItemAtPosition(i) as? Int)?.also {
                    tvYear.text = it.toString()
                    viewModel.searchTimelyExpenseSummary(it)
                }
            }
        }

        tvYear.setOnClickListener {
            spinnerYears.performClick()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_add, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_add -> {
                val args = bundleOf(EditCashEntryFragment.KEY_CASH_ENTRY_TYPE to Category.Type.EXPENSE)
                findNavController().navigate(R.id.action_overviewFragment_to_editCashEntryFragment, args)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.totalIncome.observe(this, Observer {
            tvTotalIncome.text = it.toFractionString()
            calculateBalance()
        })

        viewModel.totalExpense.observe(this, Observer {
            tvTotalExpense.text = it.toFractionString()
            calculateBalance()
        })

        Handler().postDelayed({
            viewModel.expenseSummary.observe(this, Observer {
                if (!it.isEmpty()) {
                    val barData = chartDataHelper.setupBarChartData(it)
                    barData.setValueTextSize(10f)
                    expenseBarChart.data = barData
                    expenseBarChart.setVisibleXRangeMaximum(6f)
                    expenseBarChart.invalidate()
                    expenseBarChart.animateY(500)
                }
            })

            viewModel.timelyExpenseSummary.observe(this, Observer {
                val lineData = chartDataHelper.setupLineChartData(it)
                lineData.setValueTextSize(10f)
                expenseLineChart.data = lineData
                expenseLineChart.setVisibleXRangeMaximum(6f)
                expenseLineChart.invalidate()
                expenseLineChart.animateY(1000)
            })
        }, 500)

    }

    private fun calculateBalance() {
        val income = viewModel.totalIncome.value ?: 0.0
        val expense = viewModel.totalExpense.value ?: 0.0

        tvBalance.text = (income - expense).toFractionString()
    }

}
