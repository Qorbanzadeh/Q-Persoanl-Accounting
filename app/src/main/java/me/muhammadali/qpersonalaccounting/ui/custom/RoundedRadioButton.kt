package me.muhammadali.qpersonalaccounting.ui.custom

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.widget.RadioButton
import androidx.core.content.ContextCompat
import me.muhammadali.qpersonalaccounting.R

class RoundedRadioButton : RadioButton {

    private val paintFill: Paint by lazy {
        Paint().apply {
            style = Paint.Style.FILL
            isAntiAlias = true
        }
    }

    private val paintIcon: Paint by lazy {
        Paint(Paint.FILTER_BITMAP_FLAG)
    }

    private val rectF: RectF by lazy { RectF(6f, 6f, width.toFloat() - 8, height.toFloat() - 8) }

    private val checkIcon: Bitmap by lazy {
        val d = ContextCompat.getDrawable(context, R.drawable.ic_check_white)!!
        val bitmap = Bitmap.createBitmap(d.intrinsicWidth, d.intrinsicHeight, Bitmap.Config.ARGB_8888)
        val cv = Canvas(bitmap)
        d.setBounds(0, 0, cv.width, cv.height)
        d.draw(cv)
        return@lazy bitmap
    }

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val hex: String = tag as String? ?: "#a2a2a2"

        if (width == 0 || height == 0) {
            return
        }

        paintFill.color = Color.parseColor(hex)

        canvas?.drawRoundRect(rectF, 5f, 5f, paintFill)
        // if (isChecked) canvas?.drawRoundRect(rectF, 5f, 5f, paintBorder)
        if (isChecked) {
            canvas?.drawBitmap(checkIcon, null, rectF, paintIcon)
        }

    }

}