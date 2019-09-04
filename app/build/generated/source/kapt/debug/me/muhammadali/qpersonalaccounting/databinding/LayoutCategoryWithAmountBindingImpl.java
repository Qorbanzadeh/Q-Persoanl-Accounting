package me.muhammadali.qpersonalaccounting.databinding;
import me.muhammadali.qpersonalaccounting.R;
import me.muhammadali.qpersonalaccounting.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutCategoryWithAmountBindingImpl extends LayoutCategoryWithAmountBinding  {

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

    public LayoutCategoryWithAmountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutCategoryWithAmountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.chip.Chip) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
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
            setVo((me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVo(@Nullable me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO Vo) {
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
        me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO vo = mVo;
        double voAmount = 0.0;
        java.lang.String voName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vo != null) {
                    // read vo.color
                    voColor = vo.getColor();
                    // read vo.shortName
                    voShortName = vo.getShortName();
                    // read vo.amount
                    voAmount = vo.getAmount();
                    // read vo.name
                    voName = vo.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, voName);
            me.muhammadali.qpersonalaccounting.util.BindingUtil.setDouble(this.textView6, voAmount);
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