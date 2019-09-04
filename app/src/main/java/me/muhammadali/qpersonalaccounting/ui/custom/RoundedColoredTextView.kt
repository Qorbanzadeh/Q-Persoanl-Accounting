package me.muhammadali.qpersonalaccounting.ui.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

class RoundedColoredTextView : TextView {

    private val paintFill: Paint by lazy {
        Paint().apply {
            style = Paint.Style.FILL
            isAntiAlias = true
        }
    }

    private val paintText: Paint by lazy {
        Paint().apply {
            style = Paint.Style.STROKE
            isAntiAlias = true
            color = Color.WHITE
            textAlign = Paint.Align.CENTER
            textSize = 46f
        }
    }

    // private val rectF: RectF by lazy { RectF(6f, 6f, width.toFloat() - 8, height.toFloat() - 8) }

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

        //canvas?.drawRoundRect(rectF, 5f, 5f, paintFill)
        canvas?.drawCircle(width / 2f, height / 2f, width / 2f, paintFill)

        val tx = text.toString().toUpperCase().take(2)

        val xPos = width / 2f
        val yPos = (height / 2 - (paintText.descent() + paintText.ascent()) / 2)

        canvas?.drawText(tx, xPos, yPos, paintText)

    }

}