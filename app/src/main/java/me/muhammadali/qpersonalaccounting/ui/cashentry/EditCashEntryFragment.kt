package me.muhammadali.qpersonalaccounting.ui.cashentry

import android.app.DatePickerDialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.snackbar.Snackbar
import me.muhammadali.qpersonalaccounting.BR
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.databinding.EditCashEntryBinding
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.util.toFractionString
import kotlinx.android.synthetic.main.fragment_edit_cashentry.*
import kotlinx.android.synthetic.main.layout_appbar.*
import org.joda.time.LocalDate

class EditCashEntryFragment : Fragment() {

    companion object {
        const val KEY_CASH_ENTRY_ID = "CASH_ENTRY_ID"
        const val KEY_CASH_ENTRY_TYPE = "CASH_ENTRY_TYPE"
    }

    private lateinit var viewModel: EditCashEntryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        viewModel = ViewModelProviders.of(this)[EditCashEntryViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = EditCashEntryBinding.inflate(inflater, container, false)
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

        spinnerCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView<*>?, v: View?, i: Int, l: Long) {
                viewModel.category.value = adapterView?.selectedItem as Category?
            }
        }

        edAmount.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(edit: Editable?) {
                edAmount.removeTextChangedListener(this)
                val value = edit?.toString()?.replace(",", "")
                try {
                    value?.also {
                        if (it.isNotEmpty() && !it.endsWith(".") && !it.endsWith(".0")) {
                            edAmount.setText(it.toDouble().toFractionString())
                            edAmount.setSelection(edAmount.text?.length ?: 0)
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                edAmount.addTextChangedListener(this)
            }

            override fun beforeTextChanged(cs: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(cs: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

        edCashEntryCategory.onSpinnerTouchListener = {
            spinnerCategory.performClick()
        }

        edCashEntryDate.onSpinnerTouchListener = {
            val issueDate = viewModel.entry.value?.issueDate ?: LocalDate.now()
            val year = issueDate.year
            val month = issueDate.monthOfYear - 1
            val day = issueDate.dayOfMonth
            val dialog = DatePickerDialog(context!!, R.style.AppTheme_Dialog,
                DatePickerDialog.OnDateSetListener { _, y, m, d ->
                    val date = LocalDate(y, m + 1, d)
                    viewModel.entry.value?.issueDate = date
                    viewModel.entry.value?.notifyPropertyChanged(BR.title)
                }, year, month, day)

            dialog.show()
        }

        val id = arguments?.getLong(KEY_CASH_ENTRY_ID, 0) ?: 0

        toolbar.title = getString(R.string.title_edit_entry, if (id > 0) "ویرایش" else "ایجاد")
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

        viewModel.categories.observe(this, Observer {
            val categoryAdapter = ArrayAdapter<Category>(requireContext(), R.layout.layout_simple_list_item_1)
            spinnerCategory?.adapter = categoryAdapter
            categoryAdapter.addAll(it)
            spinnerCategory?.setSelection(categoryAdapter.getPosition(viewModel.category.value))
        })

        viewModel.operation.observe(this, Observer {
            if (it) {
                findNavController().popBackStack()
            }
        })

        viewModel.error.observe(this, Observer {
            Snackbar.make(coordinatorLayout, R.string.entry_save_error, Snackbar.LENGTH_SHORT).show()
        })

        viewModel.titleError.observe(this, Observer {
            textInputLayoutTitle.error = it
        })

        viewModel.amountError.observe(this, Observer {
            textInputLayoutAmount.error = it
        })

        viewModel.categoryError.observe(this, Observer {
            textInputLayoutCategory.error = it
        })

        viewModel.type = arguments?.getSerializable(KEY_CASH_ENTRY_TYPE) as Category.Type
        viewModel.init(arguments?.getLong(KEY_CASH_ENTRY_ID, 0) ?: 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (activity as MainActivity).hideKeyboard()
    }

}