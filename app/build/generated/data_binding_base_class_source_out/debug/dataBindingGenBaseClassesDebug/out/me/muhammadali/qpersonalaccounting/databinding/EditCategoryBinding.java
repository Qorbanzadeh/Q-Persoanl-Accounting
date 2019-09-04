package me.muhammadali.qpersonalaccounting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel;

public abstract class EditCategoryBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnDelete;

  @NonNull
  public final Chip chip;

  @NonNull
  public final Chip chip10;

  @NonNull
  public final Chip chip11;

  @NonNull
  public final Chip chip12;

  @NonNull
  public final Chip chip2;

  @NonNull
  public final Chip chip3;

  @NonNull
  public final Chip chip4;

  @NonNull
  public final Chip chip5;

  @NonNull
  public final Chip chip6;

  @NonNull
  public final Chip chip7;

  @NonNull
  public final Chip chip8;

  @NonNull
  public final Chip chip9;

  @NonNull
  public final ChipGroup chipGroupColor;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final View divider3;

  @NonNull
  public final HorizontalScrollView horizontalScrollView;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton rbExpense;

  @NonNull
  public final RadioButton rbIncome;

  @NonNull
  public final TextInputEditText textInputCategoryName;

  @NonNull
  public final TextInputLayout textInputLayoutName;

  @NonNull
  public final TextView textView10;

  @Bindable
  protected EditCategoryViewModel mVm;

  protected EditCategoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnDelete, Chip chip, Chip chip10, Chip chip11, Chip chip12, Chip chip2,
      Chip chip3, Chip chip4, Chip chip5, Chip chip6, Chip chip7, Chip chip8, Chip chip9,
      ChipGroup chipGroupColor, CoordinatorLayout coordinatorLayout, View divider3,
      HorizontalScrollView horizontalScrollView, RadioGroup radioGroup, RadioButton rbExpense,
      RadioButton rbIncome, TextInputEditText textInputCategoryName,
      TextInputLayout textInputLayoutName, TextView textView10) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDelete = btnDelete;
    this.chip = chip;
    this.chip10 = chip10;
    this.chip11 = chip11;
    this.chip12 = chip12;
    this.chip2 = chip2;
    this.chip3 = chip3;
    this.chip4 = chip4;
    this.chip5 = chip5;
    this.chip6 = chip6;
    this.chip7 = chip7;
    this.chip8 = chip8;
    this.chip9 = chip9;
    this.chipGroupColor = chipGroupColor;
    this.coordinatorLayout = coordinatorLayout;
    this.divider3 = divider3;
    this.horizontalScrollView = horizontalScrollView;
    this.radioGroup = radioGroup;
    this.rbExpense = rbExpense;
    this.rbIncome = rbIncome;
    this.textInputCategoryName = textInputCategoryName;
    this.textInputLayoutName = textInputLayoutName;
    this.textView10 = textView10;
  }

  public abstract void setVm(@Nullable EditCategoryViewModel vm);

  @Nullable
  public EditCategoryViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static EditCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditCategoryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_category, root, attachToRoot, component);
  }

  @NonNull
  public static EditCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_edit_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditCategoryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_category, null, false, component);
  }

  public static EditCategoryBinding bind(@NonNull View view) {
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
  public static EditCategoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditCategoryBinding)bind(component, view, me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_category);
  }
}
