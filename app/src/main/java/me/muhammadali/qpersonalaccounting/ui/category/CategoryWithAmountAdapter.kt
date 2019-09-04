package me.muhammadali.qpersonalaccounting.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.muhammadali.qpersonalaccounting.BR
import me.muhammadali.qpersonalaccounting.databinding.LayoutCategoryWithAmountBinding
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO

class CategoryWithAmountAdapter : ListAdapter<CategoryWithAmountVO,
        CategoryWithAmountAdapter.CategoryWithAmountViewHolder>(diffUtil) {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<CategoryWithAmountVO>() {
            override fun areItemsTheSame(oldItem: CategoryWithAmountVO, newItem: CategoryWithAmountVO): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: CategoryWithAmountVO, newItem: CategoryWithAmountVO): Boolean {
                return oldItem == newItem
            }

        }
    }

    var onItemClickListener: ((View, CategoryWithAmountVO) -> Unit)? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryWithAmountViewHolder {
        val binding = LayoutCategoryWithAmountBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryWithAmountViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryWithAmountViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun getItemAt(position: Int): CategoryWithAmountVO = getItem(position)

    inner class CategoryWithAmountViewHolder(
        private val binding: ViewDataBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClickListener?.invoke(it, getItem(adapterPosition))
            }
        }

        fun bind(vo: CategoryWithAmountVO) {
            binding.setVariable(BR.vo, vo)
        }

    }

}