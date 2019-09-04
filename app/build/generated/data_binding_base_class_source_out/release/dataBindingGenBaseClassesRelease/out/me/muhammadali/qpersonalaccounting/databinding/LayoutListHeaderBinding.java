package me.muhammadali.qpersonalaccounting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;

public abstract class LayoutListHeaderBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout layoutHeader;

  @NonNull
  public final TextView textView;

  @Bindable
  protected String mTitle;

  protected LayoutListHeaderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout layoutHeader, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutHeader = layoutHeader;
    this.textView = textView;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static LayoutListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_list_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutListHeaderBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_list_header, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutListHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_list_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutListHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutListHeaderBinding>inflateInternal(inflater, me.muhammadali.qpersonalaccounting.R.layout.layout_list_header, null, false, component);
  }

  public static LayoutListHeaderBinding bind(@NonNull View view) {
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
  public static LayoutListHeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutListHeaderBinding)bind(component, view, me.muhammadali.qpersonalaccounting.R.layout.layout_list_header);
  }
}
