package me.muhammadali.qpersonalaccounting.ui.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.widget.RadioButton
import me.muhammadali.qpersonalaccounting.R

class RadioTextButton : RadioButton {

    private val paintFill: Paint by lazy {
        Paint().apply {
            style = Paint.Style.FILL
            isAntiAlias = true
            color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                context.resources.getColor(R.color.colorAccent, null)
            } else {
                context.resources.getColor(R.color.colorAccent)
            }
        }
    }

    private val paintText: Paint by lazy {
        Paint().apply {
            textSize = 48f
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
    }

    var isModifier = false

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        if (width == 0 || height == 0) {
            return
        }

        canvas?.also {
            val xPos = width / 2f
            val yPos = (height / 2) - ((paintText.descent() + paintText.ascent()) / 2)

            if (isChecked) {
                it.drawCircle(width / 2f, height / 2f, width / 2.3f, paintFill)
                paintText.color = Color.WHITE
                it.drawText(text.toString(), xPos, yPos, paintText)
            } else {
                paintText.color = if (isModifier) {
                    paintFill.color
                } else {
                    Color.BLACK
                }
                it.drawText(text.toString(), xPos, yPos, paintText)
            }
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }

}