package me.muhammadali.qpersonalaccounting.ui.cashentry

import android.app.DatePickerDialog
import android.os.Bundle
import android.os.Handler
import android.view.*
import android.widget.AdapterView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.ui.BaseNavigationFragment
import me.muhammadali.qpersonalaccounting.ui.PaddedDividerItemDecoration
import me.muhammadali.qpersonalaccounting.ui.SwipeDeleteGestureCallback
import me.muhammadali.qpersonalaccounting.util.toDefaultFormat
import me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO
import kotlinx.android.synthetic.main.fragment_cashentries.*
import org.joda.time.DateTime
import org.joda.time.LocalDate

class CashEntriesFragment : BaseNavigationFragment() {

    private lateinit var viewModel: CashEntriesViewModel
    private val adapter by lazy { CashEntryWithCategoryAdapter() }
    private var started = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[CashEntriesViewModel::class.java]

        adapter.onItemClickListener = {
            val type = Category.Type.values()[toolbarSpinner.selectedItemPosition]
            val args = bundleOf(
                EditCashEntryFragment.KEY_CASH_ENTRY_ID to it.id,
                EditCashEntryFragment.KEY_CASH_ENTRY_TYPE to type
            )
            val navOpts = NavOptions.Builder()
                .setEnterAnim(R.anim.nav_slide_enter_anim)
                .setExitAnim(R.anim.nav_slide_exit_anim)
                .setPopEnterAnim(R.anim.nav_slide_pop_enter_anim)
                .setPopExitAnim(R.anim.nav_slide_pop_exit_anim)
                .build()
            findNavController().navigate(R.id.action_cashEntriesFragment_to_editCashEntryFragment, args, navOpts)
        }

        viewModel.error.observe(this, Observer {
            val snackBar = Snackbar.make(coordinatorLayout, it, Snackbar.LENGTH_LONG)
            val params = snackBar.view.layoutParams as CoordinatorLayout.LayoutParams
            val scale = resources.displayMetrics.density
            params.bottomMargin = ((64 * scale) + 0.5f).toInt()
            snackBar.show()
        })

        viewModel.operation.observe(this, Observer {
            if (it) {
                viewModel.refresh()
            }
        })

        viewModel.entries.observe(this, Observer { list ->
            adapter.submitList(list)
            if (!started) {
                recyclerView?.scheduleLayoutAnimation()
                started = true
            }
            tvNoData.visibility = if (list.isEmpty()) View.VISIBLE else View.GONE
        })

        Handler().postDelayed({
            val from = DateTime.now().dayOfMonth().withMinimumValue().toLocalDate()
            val to = DateTime.now().dayOfMonth().withMaximumValue().toLocalDate()
            viewModel.search(from, to, Category.Type.EXPENSE)
        }, 500)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cashentries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity
        activity.supportActionBar?.setDisplayShowTitleEnabled(false)

        val swipeDeleteCallback = SwipeDeleteGestureCallback(context!!) { pos ->
            val vo = adapter.getItemAt(pos) as CashEntryWithCategoryVO?
            val type = Category.Type.values()[toolbarSpinner.selectedItemPosition]

            vo?.id?.let {
                viewModel.delete(it, type)
            }
        }

        recyclerView.apply {
            setHasFixedSize(true)
            addItemDecoration(PaddedDividerItemDecoration(0, context))
            adapter = this@CashEntriesFragment.adapter
            addOnItemTouchListener(object : RecyclerView.SimpleOnItemTouchListener() {
                override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                    return swipeDeleteCallback.gestureDetector.onTouchEvent(e)
                }
            })

            if (started) {
                layoutAnimation = null
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)

        toolbarSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView<*>?, v: View?, i: Int, l: Long) {
                val type = Category.Type.values()[i]
                started = false
                viewModel.search(type)
            }
        }

        val defaultFrom = viewModel.search.from ?: DateTime.now().dayOfMonth().withMinimumValue().toLocalDate()
        tvDateFrom.text = defaultFrom.toDefaultFormat()
        tvDateFrom.setOnClickListener {
            val dt = viewModel.search.from ?: defaultFrom

            val dialog = DatePickerDialog(context!!,
                DatePickerDialog.OnDateSetListener { _, y, m, d ->
                    val date = LocalDate(y, m + 1, d)

                    tvDateFrom.text = date.toDefaultFormat()
                    started = false
                    viewModel.searchFrom(date)
                }, dt.year, dt.monthOfYear - 1, dt.dayOfMonth)
            dialog.show()
        }

        val defaultTo = viewModel.search.to ?: DateTime.now().dayOfMonth().withMaximumValue().toLocalDate()
        tvDateTo.text = defaultTo.toDefaultFormat()
        tvDateTo.setOnClickListener {
            val dt = viewModel.search.to ?: defaultTo

            val dialog = DatePickerDialog(context!!,
                DatePickerDialog.OnDateSetListener { _, y, m, d ->
                    val date = LocalDate(y, m + 1, d)

                    tvDateTo.text = date.toDefaultFormat()
                    started = false
                    viewModel.searchTo(date)
                }, dt.year, dt.monthOfYear - 1, dt.dayOfMonth)
            dialog.show()
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
                findNavController().navigate(R.id.action_cashEntriesFragment_to_editCashEntryFragment, args)

            }
        }
        return super.onOptionsItemSelected(item)
    }

}