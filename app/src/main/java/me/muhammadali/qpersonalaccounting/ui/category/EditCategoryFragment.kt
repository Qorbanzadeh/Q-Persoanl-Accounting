package me.muhammadali.qpersonalaccounting.ui.category

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.chip.Chip
import com.google.android.material.snackbar.Snackbar
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.databinding.EditCategoryBinding
import kotlinx.android.synthetic.main.fragment_edit_category.*
import kotlinx.android.synthetic.main.layout_appbar.*

class EditCategoryFragment : Fragment() {

    companion object {
        const val KEY_CATEGORY_ID = "CATEGORY_ID"
    }

    private lateinit var viewModel: EditCategoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[EditCategoryViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = EditCategoryBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.vm = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity

        val params = toolbar.layoutParams as AppBarLayout.LayoutParams
        params.scrollFlags = 0

        activity.setSupportActionBar(toolbar)
        activity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        activity.supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_white)

        val id = arguments?.getInt(KEY_CATEGORY_ID, 0) ?: 0

        toolbar.title = getString(R.string.title_edit_category, if (id > 0) "ویرایش" else "ایجاد")

        chipGroupColor.setOnCheckedChangeListener { cg, _ ->
            val chip = cg.findViewWithTag<Chip>(viewModel.category.value?.color)
            horizontalScrollView.post {
                horizontalScrollView.scrollTo(chip?.left ?: 0, 0)
                cg.setOnCheckedChangeListener(null)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_save, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                findNavController().navigateUp()
                return true
            }
            R.id.action_save -> {
                viewModel.save()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.operation.observe(this, Observer {
            if (it) {
                findNavController().popBackStack()
            }
        })

        viewModel.error.observe(this, Observer {
            Snackbar.make(coordinatorLayout, it, Snackbar.LENGTH_SHORT).show()
        })

        viewModel.nameError.observe(this, Observer {
            textInputLayoutName.error = it
        })

        val id = arguments?.getInt(KEY_CATEGORY_ID, 0) ?: 0
        viewModel.init(id)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as MainActivity).hideKeyboard()
    }

}