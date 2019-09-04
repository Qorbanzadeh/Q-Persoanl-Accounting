package me.muhammadali.qpersonalaccounting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel;
import me.muhammadali.qpersonalaccounting.ui.custom.ReadOnlyTextInputEditText;

public abstract class EditCashEntryBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnDelete;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final TextInputEditText edAmount;

  @NonNull
  public final ReadOnlyTextInputEditText edCashEntryCategory;

  @NonNull
  public final ReadOnlyTextInputEditText edCashEntryDate;

  @NonNull
  public final TextInputEditText edRemark;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton rbExpense;

  @NonNull
  public final RadioButton rbIncome;

  @NonNull
  public final AppCompatSpinner spinnerCategory;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextInputLayout textInputLayout6;

  @NonNull
  public final TextInputLayout textInputLayoutAmount;

  @NonNull
  public final TextInputLayout textInputLayoutCategory;

  @NonNull
  public final TextInputLayout textInputLayoutTitle;

  @Bindable
  protected EditCashEntryViewModel mVm;

  protected EditCashEntryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnDelete, CoordinatorLayout coordinatorLayout, TextInputEditText edAmount,
      ReadOnlyTextInputEditText edCashEntryCategory, ReadOnlyTextInputEditText edCashEntryDate,
      TextInputEditText edRemark, RadioGroup radioGroup, RadioButton rbExpense,
      RadioButton rbIncome, AppCompatSpinner spinnerCategory, TextInputLayout textInputLayout5,
      TextInputLayout textInputLayout6, TextInputLayout textInputLayoutAmount,
      TextInputLayout textInputLayoutCategory, TextInputLayout textInputLayoutTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDelete = btnDelete;
    this.coordinatorLayout = coordinatorLayout;
    this.edAmount = edAmount;
    this.edCashEntryCategory = edCashEntryCategory;
    this.edCashEntryDate = edCashEntryDate;
    this.edRemark = edRemark;
    this.radioGroup = radioGroup;
    this.rbExpense = rbExpense;
    this.rbIncome = rbIncome;
    this.spinnerCategory = spinnerCategory;
    this.textInputLayout5 = textInputLayout5;
    this.textInputLayout6 = textInputLayout6;
    this.textInputLayoutAmount = textInputLayoutAmount;
    this.textInputLayoutCategory = textInputLayoutCategory;
    this.textInputLayoutTitle = textInputLayoutTitle;
  }

  public abstract void setVm(@Nullable EditCashEntryViewModel vm);

  @Nullable
  public EditCashEntryViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static EditCashEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_cashentry, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditCashEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditCashEntryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_cashentry, root, attachToRoot, component);
  }

  @NonNull
  public static EditCashEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_cashentry, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditCashEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditCashEntryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_cashentry, null, false, component);
  }

  public static EditCashEntryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EditCashEntryBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditCashEntryBinding)bind(component, view, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_cashentry);
  }
}
