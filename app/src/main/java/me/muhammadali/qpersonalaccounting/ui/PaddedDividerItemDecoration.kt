package me.muhammadali.qpersonalaccounting.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import me.muhammadali.qpersonalaccounting.R

class PaddedDividerItemDecoration(
    private val offset: Int,
    context: Context
) : RecyclerView.ItemDecoration() {

    private val attrs = intArrayOf(android.R.attr.listDivider)

    private val offSetAsDp by lazy {
        val scale = context.resources.displayMetrics.density
        return@lazy ((offset * scale) + 0.5f).toInt()
    }

    private var mDivider: Drawable? = null

    init {
        val styleAttrs = context.obtainStyledAttributes(attrs)
        mDivider = styleAttrs.getDrawable(0)
        styleAttrs.recycle()
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        val left = parent.paddingLeft + offSetAsDp
        val right = parent.width - parent.paddingRight

        val childCount = parent.childCount

        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)

            if (child.id == R.id.layoutHeader) {
                continue
            }

            val nextPos = i + 1
            if (nextPos != childCount && parent.getChildAt(nextPos).id == R.id.layoutHeader) {
                continue
            }

            if ((i + 1) == childCount) {
                continue
            }

            val params = child.layoutParams as RecyclerView.LayoutParams

            val top = child.bottom + params.bottomMargin
            val bottom = top + (mDivider?.intrinsicHeight ?: 1)

            mDivider?.setBounds(left, top, right, bottom)
            mDivider?.draw(c)

        }

    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        if (mDivider == null || view.id == R.id.layoutHeader) {
            outRect.set(0, 0, 0, 0)
            return
        }

        outRect.set(0, 0, 0, (mDivider?.intrinsicHeight ?: 1))
    }

}