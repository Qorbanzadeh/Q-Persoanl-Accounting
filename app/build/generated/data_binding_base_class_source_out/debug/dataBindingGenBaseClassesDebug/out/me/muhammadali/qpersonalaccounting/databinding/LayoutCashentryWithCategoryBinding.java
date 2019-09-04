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
import me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO;

public abstract class LayoutCashentryWithCategoryBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final Chip view;

  @Bindable
  protected CashEntryWithCategoryVO mVo;

  protected LayoutCashentryWithCategoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView textView5, TextView textView6, TextView textView8, Chip view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView8 = textView8;
    this.view = view;
  }

  public abstract void setVo(@Nullable CashEntryWithCategoryVO vo);

  @Nullable
  public CashEntryWithCategoryVO getVo() {
    return mVo;
  }

  @NonNull
  public static LayoutCashentryWithCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_cashentry_with_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCashentryWithCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutCashentryWithCategoryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_cashentry_with_category, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCashentryWithCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_cashentry_with_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutCashentryWithCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutCashentryWithCategoryBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_cashentry_with_category, null, false, component);
  }

  public static LayoutCashentryWithCategoryBinding bind(@NonNull View view) {
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
  public static LayoutCashentryWithCategoryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (LayoutCashentryWithCategoryBinding)bind(component, view, me.muhammadali.qpersonalaccounting.R.layout.layout_cashentry_with_category);
  }
}
