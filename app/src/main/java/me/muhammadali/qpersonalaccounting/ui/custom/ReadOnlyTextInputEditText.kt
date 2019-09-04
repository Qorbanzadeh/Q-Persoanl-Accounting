package me.muhammadali.qpersonalaccounting.ui.custom

import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.textfield.TextInputEditText

class ReadOnlyTextInputEditText : TextInputEditText {

    var onSpinnerTouchListener: ((View) -> Unit)? = null

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        setOnKeyListener { _, _, _ ->
            /*if (keyCode == KeyEvent.KEYCODE_TAB) {
                return@setOnKeyListener false
            }*/
            return@setOnKeyListener true
        }

        setOnTouchListener { _, me ->
            if (me.action == MotionEvent.ACTION_DOWN) {
                val imm = context.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                if (imm.isAcceptingText) {
                    imm.hideSoftInputFromWindow(windowToken, 0)
                }
                onSpinnerTouchListener?.invoke(this)
                requestFocus()
            }
            return@setOnTouchListener true
        }

    }
}