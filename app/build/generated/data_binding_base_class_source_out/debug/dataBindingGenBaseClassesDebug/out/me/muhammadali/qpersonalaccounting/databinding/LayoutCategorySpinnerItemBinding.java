package me.muhammadali.qpersonalaccounting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.chip.Chip;
import java.lang.Deprecated;
import java.lang.Object;
import me.muhammadali.qpersonalaccounting.model.entity.Category;

public abstract class LayoutCategorySpinnerItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView5;

  @NonNull
  public final Chip view;

  @Bindable
  protected Category mCategory;

  protected LayoutCategorySpinnerItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView textView5, Chip view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView5 = textView5;
    this.view = view;
  }

  public abstract void setCategory(@Nullable Category category);

  @Nullable
  public Category getCategory() {
    return mCategory;
  }

  @NonNull
  public static LayoutCategorySpinnerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_category_spinner_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCategorySpinnerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutCategorySpinnerItemBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_category_spinner_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCategorySpinnerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_category_spinner_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCategorySpinnerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutCategorySpinnerItemBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_category_spinner_item, null, false, component);
  }

  public static LayoutCategorySpinnerItemBinding bind(@NonNull View view) {
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
  public static LayoutCategorySpinnerItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (LayoutCategorySpinnerItemBinding)bind(component, view, me.muhammadali.qpersonalaccounting.R.layout.layout_category_spinner_item);
  }
}
