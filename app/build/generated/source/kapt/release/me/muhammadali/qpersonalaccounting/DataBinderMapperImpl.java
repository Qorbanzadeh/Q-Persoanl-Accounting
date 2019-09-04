package me.muhammadali.qpersonalaccounting;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.muhammadali.qpersonalaccounting.databinding.EditCashEntryBindingImpl;
import me.muhammadali.qpersonalaccounting.databinding.EditCategoryBindingImpl;
import me.muhammadali.qpersonalaccounting.databinding.LayoutCashentryWithCategoryBindingImpl;
import me.muhammadali.qpersonalaccounting.databinding.LayoutCategorySpinnerItemBindingImpl;
import me.muhammadali.qpersonalaccounting.databinding.LayoutCategoryWithAmountBindingImpl;
import me.muhammadali.qpersonalaccounting.databinding.LayoutListHeaderBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTEDITCASHENTRY = 1;

  private static final int LAYOUT_FRAGMENTEDITCATEGORY = 2;

  private static final int LAYOUT_LAYOUTCASHENTRYWITHCATEGORY = 3;

  private static final int LAYOUT_LAYOUTCATEGORYSPINNERITEM = 4;

  private static final int LAYOUT_LAYOUTCATEGORYWITHAMOUNT = 5;

  private static final int LAYOUT_LAYOUTLISTHEADER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_cashentry, LAYOUT_FRAGMENTEDITCASHENTRY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_category, LAYOUT_FRAGMENTEDITCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.layout_cashentry_with_category, LAYOUT_LAYOUTCASHENTRYWITHCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.layout_category_spinner_item, LAYOUT_LAYOUTCATEGORYSPINNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.layout_category_with_amount, LAYOUT_LAYOUTCATEGORYWITHAMOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(me.muhammadali.qpersonalaccounting.R.layout.layout_list_header, LAYOUT_LAYOUTLISTHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTEDITCASHENTRY: {
          if ("layout/fragment_edit_cashentry_0".equals(tag)) {
            return new EditCashEntryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_cashentry is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITCATEGORY: {
          if ("layout/fragment_edit_category_0".equals(tag)) {
            return new EditCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_category is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCASHENTRYWITHCATEGORY: {
          if ("layout/layout_cashentry_with_category_0".equals(tag)) {
            return new LayoutCashentryWithCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_cashentry_with_category is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCATEGORYSPINNERITEM: {
          if ("layout/layout_category_spinner_item_0".equals(tag)) {
            return new LayoutCategorySpinnerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_category_spinner_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCATEGORYWITHAMOUNT: {
          if ("layout/layout_category_with_amount_0".equals(tag)) {
            return new LayoutCategoryWithAmountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_category_with_amount is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTLISTHEADER: {
          if ("layout/layout_list_header_0".equals(tag)) {
            return new LayoutListHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_list_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "vm");
      sKeys.put(2, "vo");
      sKeys.put(3, "title");
      sKeys.put(4, "issueDate");
      sKeys.put(5, "category");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/fragment_edit_cashentry_0", me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_cashentry);
      sKeys.put("layout/fragment_edit_category_0", me.muhammadali.qpersonalaccounting.R.layout.fragment_edit_category);
      sKeys.put("layout/layout_cashentry_with_category_0", me.muhammadali.qpersonalaccounting.R.layout.layout_cashentry_with_category);
      sKeys.put("layout/layout_category_spinner_item_0", me.muhammadali.qpersonalaccounting.R.layout.layout_category_spinner_item);
      sKeys.put("layout/layout_category_with_amount_0", me.muhammadali.qpersonalaccounting.R.layout.layout_category_with_amount);
      sKeys.put("layout/layout_list_header_0", me.muhammadali.qpersonalaccounting.R.layout.layout_list_header);
    }
  }
}
