package me.muhammadali.qpersonalaccounting.ui.cashentry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u001cH\u0014J\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\"\u0010\u0015\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntriesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "entries", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagedList;", "Lme/muhammadali/qpersonalaccounting/vo/GroupingVO;", "getEntries", "()Landroidx/lifecycle/MutableLiveData;", "error", "", "getError", "operation", "", "getOperation", "repo", "Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "search", "Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;", "getSearch", "()Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;", "setSearch", "(Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;)V", "delete", "", "entryId", "", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "onCleared", "refresh", "from", "Lorg/joda/time/LocalDate;", "to", "searchFrom", "searchTo", "app_debug"})
public final class CashEntriesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.muhammadali.qpersonalaccounting.model.repo.CashEntryRepo repo = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private me.muhammadali.qpersonalaccounting.model.CashEntrySearch search;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<me.muhammadali.qpersonalaccounting.vo.GroupingVO>> entries = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> operation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final me.muhammadali.qpersonalaccounting.model.CashEntrySearch getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.CashEntrySearch p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<me.muhammadali.qpersonalaccounting.vo.GroupingVO>> getEntries() {
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
    
    public final void search(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate from, @org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate to, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    public final void searchFrom(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate from) {
    }
    
    public final void searchTo(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate to) {
    }
    
    public final void delete(long entryId, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    public final void refresh() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CashEntriesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}