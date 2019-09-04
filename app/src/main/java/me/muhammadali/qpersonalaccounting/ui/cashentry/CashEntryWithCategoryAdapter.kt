package me.muhammadali.qpersonalaccounting.ui.cashentry

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import me.muhammadali.qpersonalaccounting.BR
import me.muhammadali.qpersonalaccounting.databinding.LayoutCashentryWithCategoryBinding
import me.muhammadali.qpersonalaccounting.databinding.LayoutListHeaderBinding
import me.muhammadali.qpersonalaccounting.vo.CashEntryHeaderVO
import me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO
import me.muhammadali.qpersonalaccounting.vo.GroupingVO

class CashEntryWithCategoryAdapter : PagedListAdapter<GroupingVO, RecyclerView.ViewHolder>(diffUtil) {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<GroupingVO>() {
            override fun areItemsTheSame(oldItem: GroupingVO, newItem: GroupingVO): Boolean {
                return oldItem == newItem
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: GroupingVO, newItem: GroupingVO): Boolean {
                return oldItem == newItem
            }

        }
    }

    var onItemClickListener: ((CashEntryWithCategoryVO) -> Unit)? = null

    override fun getItemViewType(position: Int): Int {
        val vo = getItem(position)
        return if (vo is CashEntryHeaderVO) 0 else 1
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            0 -> {
                val binding = LayoutListHeaderBinding.inflate(inflater, parent, false)
                CashEntryHeaderViewHolder(binding)
            }
            else -> {
                val binding = LayoutCashentryWithCategoryBinding.inflate(inflater, parent, false)
                CashEntryWithCategoryViewHolder(binding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CashEntryHeaderViewHolder -> {
                holder.bind((getItem(position) as CashEntryHeaderVO).header)
            }
            is CashEntryWithCategoryViewHolder -> {
                holder.bind(getItem(position) as CashEntryWithCategoryVO)
            }
        }
    }

    fun getItemAt(position: Int) = getItem(position)

    inner class CashEntryHeaderViewHolder(
        private val binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(title: String) {
            binding.setVariable(BR.title, title)
        }

    }

    inner class CashEntryWithCategoryViewHolder(
        private val binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClickListener?.invoke(getItem(adapterPosition) as CashEntryWithCategoryVO)
            }
        }

        fun bind(vo: CashEntryWithCategoryVO) {
            binding.setVariable(BR.vo, vo)
        }

    }

}