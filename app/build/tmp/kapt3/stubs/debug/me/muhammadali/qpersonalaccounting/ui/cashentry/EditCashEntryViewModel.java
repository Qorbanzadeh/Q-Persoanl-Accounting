package me.muhammadali.qpersonalaccounting.ui.cashentry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020+2\u0006\u0010.\u001a\u000201J\b\u00102\u001a\u00020+H\u0014J\u000e\u00103\u001a\u00020+2\u0006\u0010$\u001a\u00020%J\u0006\u00104\u001a\u00020+R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\tR\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\tR\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u00065"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/EditCashEntryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "amountError", "Landroidx/lifecycle/MutableLiveData;", "", "getAmountError", "()Landroidx/lifecycle/MutableLiveData;", "categories", "", "Lme/muhammadali/qpersonalaccounting/model/entity/Category;", "getCategories", "category", "getCategory", "categoryError", "getCategoryError", "categoryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "entry", "Lme/muhammadali/qpersonalaccounting/model/entity/CashEntry;", "getEntry", "entryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "error", "getError", "isValid", "", "()Z", "operation", "getOperation", "titleError", "getTitleError", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "getType", "()Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "setType", "(Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;)V", "delete", "", "findCategories", "findCategory", "id", "", "init", "", "onCleared", "onTypeSelect", "save", "app_debug"})
public final class EditCashEntryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.muhammadali.qpersonalaccounting.model.repo.CashEntryRepo entryRepo = null;
    private final me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo categoryRepo = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private me.muhammadali.qpersonalaccounting.model.entity.Category.Type type;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> entry = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.model.entity.Category>> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> category = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> operation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> titleError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> categoryError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final me.muhammadali.qpersonalaccounting.model.entity.Category.Type getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> getEntry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.model.entity.Category>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOperation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitleError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCategoryError() {
        return null;
    }
    
    public final void init(long id) {
    }
    
    public final void save() {
    }
    
    public final void delete() {
    }
    
    public final void onTypeSelect(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void findCategory(int id) {
    }
    
    private final void findCategories() {
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public EditCashEntryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}