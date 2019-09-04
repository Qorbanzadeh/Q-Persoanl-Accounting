package me.muhammadali.qpersonalaccounting.databinding;
import me.muhammadali.qpersonalaccounting.R;
import me.muhammadali.qpersonalaccounting.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditCategoryBindingImpl extends EditCategoryBinding implements me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener.Listener, me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.radioGroup, 17);
        sViewsWithIds.put(R.id.textInputLayoutName, 18);
        sViewsWithIds.put(R.id.divider3, 19);
        sViewsWithIds.put(R.id.textView10, 20);
        sViewsWithIds.put(R.id.horizontalScrollView, 21);
        sViewsWithIds.put(R.id.chipGroupColor, 22);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback11;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback12;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback9;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback13;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback8;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback4;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback14;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback10;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback7;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener textInputCategoryNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.category.getValue().name
            //         is vm.category.getValue().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(textInputCategoryName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;
            // vm.category
            androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> vmCategory = null;
            // vm.category.getValue()
            me.muhammadali.qpersonalaccounting.model.entity.Category vmCategoryGetValue = null;
            // vm.category != null
            boolean vmCategoryJavaLangObjectNull = false;
            // vm.category.getValue() != null
            boolean vmCategoryGetValueJavaLangObjectNull = false;
            // vm.category.getValue().name
            java.lang.String vmCategoryName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmCategory = vm.getCategory();

                vmCategoryJavaLangObjectNull = (vmCategory) != (null);
                if (vmCategoryJavaLangObjectNull) {


                    vmCategoryGetValue = vmCategory.getValue();

                    vmCategoryGetValueJavaLangObjectNull = (vmCategoryGetValue) != (null);
                    if (vmCategoryGetValueJavaLangObjectNull) {




                        vmCategoryGetValue.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public EditCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private EditCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.chip.Chip) bindings[4]
            , (com.google.android.material.chip.Chip) bindings[13]
            , (com.google.android.material.chip.Chip) bindings[14]
            , (com.google.android.material.chip.Chip) bindings[15]
            , (com.google.android.material.chip.Chip) bindings[5]
            , (com.google.android.material.chip.Chip) bindings[6]
            , (com.google.android.material.chip.Chip) bindings[7]
            , (com.google.android.material.chip.Chip) bindings[8]
            , (com.google.android.material.chip.Chip) bindings[9]
            , (com.google.android.material.chip.Chip) bindings[10]
            , (com.google.android.material.chip.Chip) bindings[11]
            , (com.google.android.material.chip.Chip) bindings[12]
            , (com.google.android.material.chip.ChipGroup) bindings[22]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.view.View) bindings[19]
            , (android.widget.HorizontalScrollView) bindings[21]
            , (android.widget.RadioGroup) bindings[17]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.RadioButton) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (android.widget.TextView) bindings[20]
            );
        this.btnDelete.setTag(null);
        this.chip.setTag("#a2a2a2");
        this.chip10.setTag("#795548");
        this.chip11.setTag("#9C27B0");
        this.chip12.setTag("#3f51b5");
        this.chip2.setTag("#e91e63");
        this.chip3.setTag("#2196f3");
        this.chip4.setTag("#00bcd4");
        this.chip5.setTag("#4caf50");
        this.chip6.setTag("#ff5722");
        this.chip7.setTag("#ffc107");
        this.chip8.setTag("#cddc39");
        this.chip9.setTag("#ff9800");
        this.coordinatorLayout.setTag(null);
        this.rbExpense.setTag(null);
        this.rbIncome.setTag(null);
        this.textInputCategoryName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 15);
        mCallback11 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 11);
        mCallback6 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 6);
        mCallback2 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 2);
        mCallback12 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 12);
        mCallback9 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 9);
        mCallback5 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 5);
        mCallback1 = new me.muhammadali.qpersonalaccounting.generated.callback.OnClickListener(this, 1);
        mCallback13 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 13);
        mCallback8 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 8);
        mCallback4 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 4);
        mCallback14 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 14);
        mCallback10 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 10);
        mCallback7 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 7);
        mCallback3 = new me.muhammadali.qpersonalaccounting.generated.callback.OnCheckedChangeListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setVm((me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCategory((androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCategory(androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> VmCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        int vmCategoryIdInt0ViewVISIBLEViewGONE = 0;
        boolean vmCategoryTypeTypeEXPENSE = false;
        boolean vmCategoryColorEqualsJavaLangString00bcd4 = false;
        boolean vmCategoryIdInt0 = false;
        java.lang.String vmCategoryName = null;
        boolean vmCategoryColorEqualsJavaLangString2196f3 = false;
        me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;
        boolean vmCategoryColorEqualsJavaLangStringFf9800 = false;
        java.lang.String vmCategoryColor = null;
        int vmCategoryId = 0;
        boolean vmCategoryColorEqualsJavaLangString9C27B0 = false;
        androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> vmCategory = null;
        boolean vmCategoryColorEqualsJavaLangStringA2a2a2 = false;
        boolean vmCategoryColorEqualsJavaLangString4caf50 = false;
        boolean vmCategoryColorEqualsJavaLangString795548 = false;
        boolean vmCategoryColorEqualsJavaLangStringCddc39 = false;
        me.muhammadali.qpersonalaccounting.model.entity.Category.Type vmCategoryType = null;
        boolean vmCategoryColorEqualsJavaLangStringFf5722 = false;
        boolean vmCategoryColorEqualsJavaLangStringE91e63 = false;
        boolean vmCategoryTypeTypeINCOME = false;
        me.muhammadali.qpersonalaccounting.model.entity.Category vmCategoryGetValue = null;
        boolean vmCategoryColorEqualsJavaLangString3f51b5 = false;
        boolean vmCategoryColorEqualsJavaLangStringFfc107 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.category
                    vmCategory = vm.getCategory();
                }
                updateLiveDataRegistration(0, vmCategory);


                if (vmCategory != null) {
                    // read vm.category.getValue()
                    vmCategoryGetValue = vmCategory.getValue();
                }


                if (vmCategoryGetValue != null) {
                    // read vm.category.getValue().name
                    vmCategoryName = vmCategoryGetValue.getName();
                    // read vm.category.getValue().color
                    vmCategoryColor = vmCategoryGetValue.getColor();
                    // read vm.category.getValue().id
                    vmCategoryId = vmCategoryGetValue.getId();
                    // read vm.category.getValue().type
                    vmCategoryType = vmCategoryGetValue.getType();
                }


                if (vmCategoryColor != null) {
                    // read vm.category.getValue().color.equals("#00bcd4")
                    vmCategoryColorEqualsJavaLangString00bcd4 = vmCategoryColor.equals("#00bcd4");
                    // read vm.category.getValue().color.equals("#2196f3")
                    vmCategoryColorEqualsJavaLangString2196f3 = vmCategoryColor.equals("#2196f3");
                    // read vm.category.getValue().color.equals("#ff9800")
                    vmCategoryColorEqualsJavaLangStringFf9800 = vmCategoryColor.equals("#ff9800");
                    // read vm.category.getValue().color.equals("#9C27B0")
                    vmCategoryColorEqualsJavaLangString9C27B0 = vmCategoryColor.equals("#9C27B0");
                    // read vm.category.getValue().color.equals("#a2a2a2")
                    vmCategoryColorEqualsJavaLangStringA2a2a2 = vmCategoryColor.equals("#a2a2a2");
                    // read vm.category.getValue().color.equals("#4caf50")
                    vmCategoryColorEqualsJavaLangString4caf50 = vmCategoryColor.equals("#4caf50");
                    // read vm.category.getValue().color.equals("#795548")
                    vmCategoryColorEqualsJavaLangString795548 = vmCategoryColor.equals("#795548");
                    // read vm.category.getValue().color.equals("#cddc39")
                    vmCategoryColorEqualsJavaLangStringCddc39 = vmCategoryColor.equals("#cddc39");
                    // read vm.category.getValue().color.equals("#ff5722")
                    vmCategoryColorEqualsJavaLangStringFf5722 = vmCategoryColor.equals("#ff5722");
                    // read vm.category.getValue().color.equals("#e91e63")
                    vmCategoryColorEqualsJavaLangStringE91e63 = vmCategoryColor.equals("#e91e63");
                    // read vm.category.getValue().color.equals("#3f51b5")
                    vmCategoryColorEqualsJavaLangString3f51b5 = vmCategoryColor.equals("#3f51b5");
                    // read vm.category.getValue().color.equals("#ffc107")
                    vmCategoryColorEqualsJavaLangStringFfc107 = vmCategoryColor.equals("#ffc107");
                }
                // read vm.category.getValue().id > 0
                vmCategoryIdInt0 = (vmCategoryId) > (0);
                // read vm.category.getValue().type == Type.EXPENSE
                vmCategoryTypeTypeEXPENSE = (vmCategoryType) == (me.muhammadali.qpersonalaccounting.model.entity.Category.Type.EXPENSE);
                // read vm.category.getValue().type == Type.INCOME
                vmCategoryTypeTypeINCOME = (vmCategoryType) == (me.muhammadali.qpersonalaccounting.model.entity.Category.Type.INCOME);
            if((dirtyFlags & 0x7L) != 0) {
                if(vmCategoryIdInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read vm.category.getValue().id > 0 ? View.VISIBLE : View.GONE
                vmCategoryIdInt0ViewVISIBLEViewGONE = ((vmCategoryIdInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnDelete.setOnClickListener(mCallback15);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip, mCallback3, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip10, mCallback12, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip11, mCallback13, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip12, mCallback14, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip2, mCallback4, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip3, mCallback5, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip4, mCallback6, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip5, mCallback7, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip6, mCallback8, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip7, mCallback9, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip8, mCallback10, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.chip9, mCallback11, (androidx.databinding.InverseBindingListener)null);
            this.rbExpense.setOnClickListener(mCallback1);
            this.rbIncome.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textInputCategoryName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, textInputCategoryNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.btnDelete.setVisibility(vmCategoryIdInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip, vmCategoryColorEqualsJavaLangStringA2a2a2);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip10, vmCategoryColorEqualsJavaLangString795548);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip11, vmCategoryColorEqualsJavaLangString9C27B0);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip12, vmCategoryColorEqualsJavaLangString3f51b5);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip2, vmCategoryColorEqualsJavaLangStringE91e63);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip3, vmCategoryColorEqualsJavaLangString2196f3);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip4, vmCategoryColorEqualsJavaLangString00bcd4);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip5, vmCategoryColorEqualsJavaLangString4caf50);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip6, vmCategoryColorEqualsJavaLangStringFf5722);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip7, vmCategoryColorEqualsJavaLangStringFfc107);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip8, vmCategoryColorEqualsJavaLangStringCddc39);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.chip9, vmCategoryColorEqualsJavaLangStringFf9800);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbExpense, vmCategoryTypeTypeEXPENSE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbIncome, vmCategoryTypeTypeINCOME);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textInputCategoryName, vmCategoryName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.delete();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



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
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onTypeSelect(me.muhammadali.qpersonalaccounting.model.entity.Category.Type.EXPENSE);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#ff9800");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#00bcd4");
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#795548");
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#ffc107");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#2196f3");
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#9C27B0");
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#ff5722");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#e91e63");
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#3f51b5");
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#cddc39");
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#4caf50");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                me.muhammadali.qpersonalaccounting.ui.category.EditCategoryViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {




                    vm.onColorCheck(callbackArg_1, "#a2a2a2");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.category
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
        flag 3 (0x4L): vm.category.getValue().id > 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): vm.category.getValue().id > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}