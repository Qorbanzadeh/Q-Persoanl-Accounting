package me.muhammadali.qpersonalaccounting.databinding;
import me.muhammadali.qpersonalaccounting.R;
import me.muhammadali.qpersonalaccounting.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditCashEntryBindingImpl extends EditCashEntryBinding implements me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.radioGroup, 9);
        sViewsWithIds.put(R.id.textInputLayoutTitle, 10);
        sViewsWithIds.put(R.id.textInputLayoutAmount, 11);
        sViewsWithIds.put(R.id.spinnerCategory, 12);
        sViewsWithIds.put(R.id.textInputLayoutCategory, 13);
        sViewsWithIds.put(R.id.textInputLayout5, 14);
        sViewsWithIds.put(R.id.textInputLayout6, 15);
    }
    // views
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edAmountandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.entry.getValue().amount
            //         is vm.entry.getValue().setAmount((double) callbackArg_0)
            double callbackArg_0 = me.muhammadali.qpersonalaccounting.util.BindingUtil.getDouble(edAmount);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;
            // vm.entry.getValue().amount
            double vmEntryAmount = 0.0;
            // vm.entry.getValue()
            me.muhammadali.qpersonalaccounting.model.entity.CashEntry vmEntryGetValue = null;
            // vm.entry
            androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> vmEntry = null;
            // vm.entry.getValue() != null
            boolean vmEntryGetValueJavaLangObjectNull = false;
            // vm.entry != null
            boolean vmEntryJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEntry = vm.getEntry();

                vmEntryJavaLangObjectNull = (vmEntry) != (null);
                if (vmEntryJavaLangObjectNull) {


                    vmEntryGetValue = vmEntry.getValue();

                    vmEntryGetValueJavaLangObjectNull = (vmEntryGetValue) != (null);
                    if (vmEntryGetValueJavaLangObjectNull) {




                        vmEntryGetValue.setAmount(((double) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edRemarkandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.entry.getValue().description
            //         is vm.entry.getValue().setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edRemark);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;
            // vm.entry.getValue()
            me.muhammadali.qpersonalaccounting.model.entity.CashEntry vmEntryGetValue = null;
            // vm.entry
            androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> vmEntry = null;
            // vm.entry.getValue() != null
            boolean vmEntryGetValueJavaLangObjectNull = false;
            // vm.entry != null
            boolean vmEntryJavaLangObjectNull = false;
            // vm.entry.getValue().description
            java.lang.String vmEntryDescription = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEntry = vm.getEntry();

                vmEntryJavaLangObjectNull = (vmEntry) != (null);
                if (vmEntryJavaLangObjectNull) {


                    vmEntryGetValue = vmEntry.getValue();

                    vmEntryGetValueJavaLangObjectNull = (vmEntryGetValue) != (null);
                    if (vmEntryGetValueJavaLangObjectNull) {




                        vmEntryGetValue.setDescription(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.entry.getValue().title
            //         is vm.entry.getValue().setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;
            // vm.entry.getValue().title
            java.lang.String vmEntryTitle = null;
            // vm.entry.getValue()
            me.muhammadali.qpersonalaccounting.model.entity.CashEntry vmEntryGetValue = null;
            // vm.entry
            androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> vmEntry = null;
            // vm.entry.getValue() != null
            boolean vmEntryGetValueJavaLangObjectNull = false;
            // vm.entry != null
            boolean vmEntryJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEntry = vm.getEntry();

                vmEntryJavaLangObjectNull = (vmEntry) != (null);
                if (vmEntryJavaLangObjectNull) {


                    vmEntryGetValue = vmEntry.getValue();

                    vmEntryGetValueJavaLangObjectNull = (vmEntryGetValue) != (null);
                    if (vmEntryGetValueJavaLangObjectNull) {




                        vmEntryGetValue.setTitle(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public EditCashEntryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private EditCashEntryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (me.muhammadali.qpersonalaccounting.ui.custom.ReadOnlyTextInputEditText) bindings[5]
            , (me.muhammadali.qpersonalaccounting.ui.custom.ReadOnlyTextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.RadioButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            );
        this.btnDelete.setTag(null);
        this.coordinatorLayout.setTag(null);
        this.edAmount.setTag(null);
        this.edCashEntryCategory.setTag(null);
        this.edCashEntryDate.setTag(null);
        this.edRemark.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.rbExpense.setTag(null);
        this.rbIncome.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 2);
        mCallback16 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 1);
        mCallback18 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.vm == variableId) {
            setVm((me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmEntry((androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry>) object, fieldId);
            case 1 :
                return onChangeVmCategory((androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category>) object, fieldId);
            case 2 :
                return onChangeVmEntryGetValue((me.muhammadali.qpersonalaccounting.model.entity.CashEntry) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmEntry(androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> VmEntry, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCategory(androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> VmCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEntryGetValue(me.muhammadali.qpersonalaccounting.model.entity.CashEntry VmEntryGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.issueDate) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
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
        org.joda.time.LocalDate vmEntryIssueDate = null;
        java.lang.String vmCategoryName = null;
        me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> vmEntry = null;
        boolean vmTypeTypeEXPENSE = false;
        boolean vmEntryIdInt0 = false;
        boolean vmTypeTypeINCOME = false;
        int vmEntryIdInt0ViewVISIBLEViewGONE = 0;
        java.lang.String vmEntryTitle = null;
        long vmEntryId = 0;
        androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> vmCategory = null;
        me.muhammadali.qpersonalaccounting.model.entity.Category vmCategoryGetValue = null;
        double vmEntryAmount = 0.0;
        me.muhammadali.qpersonalaccounting.model.entity.CashEntry vmEntryGetValue = null;
        me.muhammadali.qpersonalaccounting.model.entity.Category.Type vmType = null;
        java.lang.String vmEntryDescription = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x3dL) != 0) {

                    if (vm != null) {
                        // read vm.entry
                        vmEntry = vm.getEntry();
                    }
                    updateLiveDataRegistration(0, vmEntry);


                    if (vmEntry != null) {
                        // read vm.entry.getValue()
                        vmEntryGetValue = vmEntry.getValue();
                    }
                    updateRegistration(2, vmEntryGetValue);


                    if (vmEntryGetValue != null) {
                        // read vm.entry.getValue().issueDate
                        vmEntryIssueDate = vmEntryGetValue.getIssueDate();
                    }
                if ((dirtyFlags & 0x2dL) != 0) {

                        if (vmEntryGetValue != null) {
                            // read vm.entry.getValue().title
                            vmEntryTitle = vmEntryGetValue.getTitle();
                            // read vm.entry.getValue().id
                            vmEntryId = vmEntryGetValue.getId();
                            // read vm.entry.getValue().amount
                            vmEntryAmount = vmEntryGetValue.getAmount();
                            // read vm.entry.getValue().description
                            vmEntryDescription = vmEntryGetValue.getDescription();
                        }


                        // read vm.entry.getValue().id > 0
                        vmEntryIdInt0 = (vmEntryId) > (0);
                    if((dirtyFlags & 0x2dL) != 0) {
                        if(vmEntryIdInt0) {
                                dirtyFlags |= 0x80L;
                        }
                        else {
                                dirtyFlags |= 0x40L;
                        }
                    }


                        // read vm.entry.getValue().id > 0 ? View.VISIBLE : View.GONE
                        vmEntryIdInt0ViewVISIBLEViewGONE = ((vmEntryIdInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.category
                        vmCategory = vm.getCategory();
                    }
                    updateLiveDataRegistration(1, vmCategory);


                    if (vmCategory != null) {
                        // read vm.category.getValue()
                        vmCategoryGetValue = vmCategory.getValue();
                    }


                    if (vmCategoryGetValue != null) {
                        // read vm.category.getValue().name
                        vmCategoryName = vmCategoryGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x28L) != 0) {

                    if (vm != null) {
                        // read vm.type
                        vmType = vm.getType();
                    }


                    // read vm.type == Type.EXPENSE
                    vmTypeTypeEXPENSE = (vmType) == (me.muhammadali.qpersonalaccounting.model.entity.Category.Type.EXPENSE);
                    // read vm.type == Type.INCOME
                    vmTypeTypeINCOME = (vmType) == (me.muhammadali.qpersonalaccounting.model.entity.Category.Type.INCOME);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnDelete.setOnClickListener(mCallback18);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edAmount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edAmountandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edRemark, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edRemarkandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            this.rbExpense.setOnClickListener(mCallback16);
            this.rbIncome.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x2dL) != 0) {
            // api target 1

            this.btnDelete.setVisibility(vmEntryIdInt0ViewVISIBLEViewGONE);
            me.muhammadali.qpersonalaccounting.util.BindingUtil.setDouble(this.edAmount, vmEntryAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edRemark, vmEntryDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, vmEntryTitle);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edCashEntryCategory, vmCategoryName);
        }
        if ((dirtyFlags & 0x3dL) != 0) {
            // api target 1

            me.muhammadali.qpersonalaccounting.util.BindingUtil.setDate(this.edCashEntryDate, vmEntryIssueDate);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbExpense, vmTypeTypeEXPENSE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbIncome, vmTypeTypeINCOME);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onTypeSelect(me.muhammadali.qpersonalaccounting.model.entity.Category.Type.INCOME);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onTypeSelect(me.muhammadali.qpersonalaccounting.model.entity.Category.Type.EXPENSE);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.cashentry.EditCashEntryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.delete();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.entry
        flag 1 (0x2L): vm.category
        flag 2 (0x3L): vm.entry.getValue()
        flag 3 (0x4L): vm
        flag 4 (0x5L): vm.entry.getValue().issueDate
        flag 5 (0x6L): null
        flag 6 (0x7L): vm.entry.getValue().id > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): vm.entry.getValue().id > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}