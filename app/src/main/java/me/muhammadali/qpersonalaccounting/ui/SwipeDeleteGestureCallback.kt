package me.muhammadali.qpersonalaccounting.ui

import android.content.Context
import android.graphics.*
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import me.muhammadali.qpersonalaccounting.R

class SwipeDeleteGestureCallback(
    private val context: Context,
    private val handler: ((Int) -> Unit)?
) : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

    private val paint = Paint().apply {
        color = Color.parseColor("#f13a37")
        //maskFilter = BlurMaskFilter(5f, BlurMaskFilter.Blur.INNER)
    }

    private val items = mutableListOf<SwipeItem>()

    private val gestureListener = object : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapUp(e: MotionEvent?): Boolean {
            for (item in items) {
                if (item.region.contains(e!!.x, e.y)) {
                    handler?.invoke(item.position)
                    return true
                }
            }
            return false
        }
    }

    val gestureDetector = GestureDetector(context, gestureListener)

    private val icon by lazy {
        val drawable = context.resources.getDrawable(R.drawable.ic_delete_white, null)
        val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)

        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)

        return@lazy bitmap
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun getSwipeThreshold(viewHolder: RecyclerView.ViewHolder): Float {
        return 0.35f
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val position = viewHolder.adapterPosition
        val view = viewHolder.itemView

        if (view.id != R.id.layoutHeader) {
            val region = RectF(view.right.toFloat().minus(view.height), view.top.toFloat(),
                view.right.toFloat(), view.bottom.toFloat())

            items.add(SwipeItem(position, region))
        }

    }

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {

        val view = viewHolder.itemView

        if (view.id != R.id.layoutHeader && actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
            val width = view.height / 3
            val tX = dX.times(view.height).div(view.width)

            val background = RectF(view.right.toFloat() + tX, view.top.toFloat(),
                view.right.toFloat(), view.bottom.toFloat())
            c.drawRect(background, paint)

            val iconDest = RectF(view.right.toFloat() - 2 * width, view.top.toFloat() + width,
                view.right.toFloat() - width, view.bottom.toFloat() - width)
            c.drawBitmap(icon, null, iconDest, paint)

            super.onChildDraw(c, recyclerView, viewHolder, tX, dY, actionState, isCurrentlyActive)
        }
    }

    override fun onChildDrawOver(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder?,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        super.onChildDrawOver(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)

        val position = viewHolder?.adapterPosition
        val view = viewHolder?.itemView

        if (view?.id != R.id.layoutHeader && actionState == ItemTouchHelper.ACTION_STATE_SWIPE && !isCurrentlyActive) {
            for (item in items) {
                if (item.position == position) {
                    items.remove(item)
                    break
                }
            }
        }
    }

    data class SwipeItem(
        var position: Int,
        var region: RectF
    )

}