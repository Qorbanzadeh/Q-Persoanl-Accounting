package me.muhammadali.qpersonalaccounting.databinding;
import me.muhammadali.qpersonalaccounting.R;
import me.muhammadali.qpersonalaccounting.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutCashentryWithCategoryBindingImpl extends LayoutCashentryWithCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutCashentryWithCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutCashentryWithCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.chip.Chip) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        this.textView8.setTag(null);
        this.view.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vo == variableId) {
            setVo((me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVo(@Nullable me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO Vo) {
        this.mVo = Vo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String voColor = null;
        java.lang.String voShortName = null;
        me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO vo = mVo;
        java.lang.String voCategory = null;
        java.lang.String voTitle = null;
        java.lang.String voAmount = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vo != null) {
                    // read vo.color
                    voColor = vo.getColor();
                    // read vo.shortName
                    voShortName = vo.getShortName();
                    // read vo.category
                    voCategory = vo.getCategory();
                    // read vo.title
                    voTitle = vo.getTitle();
                    // read vo._amount
                    voAmount = vo.get_amount();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, voTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, voAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, voCategory);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.view, voShortName);
            me.muhammadali.qpersonalaccounting.util.BindingUtil.setColor(this.view, voColor);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}