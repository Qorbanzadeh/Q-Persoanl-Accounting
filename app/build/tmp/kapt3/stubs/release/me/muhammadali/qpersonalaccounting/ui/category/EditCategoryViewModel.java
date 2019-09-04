package me.muhammadali.qpersonalaccounting.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0014J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/category/EditCategoryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "category", "Landroidx/lifecycle/MutableLiveData;", "Lme/muhammadali/qpersonalaccounting/model/entity/Category;", "getCategory", "()Landroidx/lifecycle/MutableLiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "error", "", "getError", "isValid", "", "()Z", "nameError", "getNameError", "operation", "getOperation", "repo", "Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "delete", "", "init", "id", "", "onCleared", "onColorCheck", "isChecked", "color", "onTypeSelect", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "save", "app_release"})
public final class EditCategoryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo repo = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<me.muhammadali.qpersonalaccounting.model.entity.Category> category = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> operation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nameError = null;
    
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNameError() {
        return null;
    }
    
    public final void init(int id) {
    }
    
    public final void save() {
    }
    
    public final void delete() {
    }
    
    public final void onTypeSelect(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    public final void onColorCheck(boolean isChecked, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public EditCategoryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}