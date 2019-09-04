package me.muhammadali.qpersonalaccounting.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lme/muhammadali/qpersonalaccounting/util/BindingUtil;", "", "()V", "Companion", "app_release"})
public final class BindingUtil {
    public static final me.muhammadali.qpersonalaccounting.util.BindingUtil.Companion Companion = null;
    
    public BindingUtil() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setDouble(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText editText, double value) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setDate(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText editText, @org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate value) {
    }
    
    @androidx.databinding.InverseBindingAdapter(attribute = "android:text")
    public static final double getDouble(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText editText) {
        return 0.0;
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setDouble(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.Double value) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:chipBackgroundColor"})
    public static final void setColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.chip.Chip chip, @org.jetbrains.annotations.NotNull()
    java.lang.String hex) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u00a8\u0006\u0014"}, d2 = {"Lme/muhammadali/qpersonalaccounting/util/BindingUtil$Companion;", "", "()V", "getDouble", "", "editText", "Lcom/google/android/material/textfield/TextInputEditText;", "setColor", "", "chip", "Lcom/google/android/material/chip/Chip;", "hex", "", "setDate", "value", "Lorg/joda/time/LocalDate;", "setDouble", "textView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "app_release"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"android:text"})
        public final void setDouble(@org.jetbrains.annotations.NotNull()
        com.google.android.material.textfield.TextInputEditText editText, double value) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:text"})
        public final void setDate(@org.jetbrains.annotations.NotNull()
        com.google.android.material.textfield.TextInputEditText editText, @org.jetbrains.annotations.Nullable()
        org.joda.time.LocalDate value) {
        }
        
        @androidx.databinding.InverseBindingAdapter(attribute = "android:text")
        public final double getDouble(@org.jetbrains.annotations.NotNull()
        com.google.android.material.textfield.TextInputEditText editText) {
            return 0.0;
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:text"})
        public final void setDouble(@org.jetbrains.annotations.NotNull()
        android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
        java.lang.Double value) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"app:chipBackgroundColor"})
        public final void setColor(@org.jetbrains.annotations.NotNull()
        com.google.android.material.chip.Chip chip, @org.jetbrains.annotations.NotNull()
        java.lang.String hex) {
        }
        
        private Companion() {
            super();
        }
    }
}