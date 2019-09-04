package me.muhammadali.qpersonalaccounting.ui.category

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
import kotlinx.android.synthetic.main.fragment_categories.*
import kotlinx.android.synthetic.main.layout_appbar_with_spinner.*

class CategoriesFragment : BaseNavigationFragment() {

    private lateinit var viewModel: CategoriesViewModel
    private val adapter by lazy { CategoryWithAmountAdapter() }
    private var started = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[CategoriesViewModel::class.java]

        adapter.onItemClickListener = { _, vo ->
            val args = bundleOf(EditCategoryFragment.KEY_CATEGORY_ID to vo.id)
            val navOpts = NavOptions.Builder()
                .setEnterAnim(R.anim.nav_slide_enter_anim)
                .setExitAnim(R.anim.nav_slide_exit_anim)
                .setPopEnterAnim(R.anim.nav_slide_pop_enter_anim)
                .setPopExitAnim(R.anim.nav_slide_pop_exit_anim)
                .build()
            findNavController().navigate(R.id.action_categoriesFragment_to_editCategoryFragment, args, navOpts)
        }

        viewModel.error.observe(this, Observer {
            val snackBar = Snackbar.make(coordinatorLayout, it, Snackbar.LENGTH_LONG)
            val params = snackBar.view.layoutParams as CoordinatorLayout.LayoutParams
            val scale = resources.displayMetrics.density
            params.bottomMargin = ((64 * scale) + 0.5f).toInt()

            snackBar.show()
        })

        Handler().postDelayed({
            viewModel.categories.observe(this, Observer { list ->
                adapter.submitList(list)
                if (!started) {
                    recyclerView?.scheduleLayoutAnimation()
                    started = true
                }
                tvNoData.visibility = if (list.isEmpty()) View.VISIBLE else View.GONE
            })
        }, 500)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity
        activity.supportActionBar?.setDisplayShowTitleEnabled(false)

        val swipeDeleteCallback = SwipeDeleteGestureCallback(context!!) { pos ->
            viewModel.delete(adapter.getItemAt(pos).id)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            addItemDecoration(PaddedDividerItemDecoration(0, context))
            adapter = this@CategoriesFragment.adapter
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

    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_add, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_add -> findNavController().navigate(R.id.action_categoriesFragment_to_editCategoryFragment)
        }
        return super.onOptionsItemSelected(item)
    }

}