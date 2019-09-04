package me.muhammadali.qpersonalaccounting.util

import android.content.res.ColorStateList
import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import com.google.android.material.chip.Chip
import com.google.android.material.textfield.TextInputEditText
import org.joda.time.LocalDate

class BindingUtil {

    companion object {

        @JvmStatic
        @BindingAdapter("android:text")
        fun setDouble(editText: TextInputEditText, value: Double) {
            if (value > 0) {
                editText.setText(value.toFractionString())
            }
        }

        @JvmStatic
        @BindingAdapter("android:text")
        fun setDate(editText: TextInputEditText, value: LocalDate?) {
            editText.setText(value?.toDefaultFormat())
        }

        @JvmStatic
        @InverseBindingAdapter(attribute = "android:text")
        fun getDouble(editText: TextInputEditText): Double {
            val value = editText.text.toString().replace(",", "")
            return if (value.isEmpty() || value == ".") 0.0 else value.toDouble()
        }

        @JvmStatic
        @BindingAdapter("android:text")
        fun setDouble(textView: TextView, value: Double?) {
            textView.text = value?.toFractionString()
        }

        @JvmStatic
        @BindingAdapter("app:chipBackgroundColor")
        fun setColor(chip: Chip, hex: String) {
            chip.chipBackgroundColor = ColorStateList.valueOf(Color.parseColor(hex))
        }

    }

}