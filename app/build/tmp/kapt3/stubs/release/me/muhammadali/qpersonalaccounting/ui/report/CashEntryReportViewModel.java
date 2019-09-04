package me.muhammadali.qpersonalaccounting.ui.report;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014\u00a8\u0006!"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/report/CashEntryReportViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "repo", "Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "reportSearch", "Lme/muhammadali/qpersonalaccounting/model/ReportSearch;", "getReportSearch", "()Lme/muhammadali/qpersonalaccounting/model/ReportSearch;", "setReportSearch", "(Lme/muhammadali/qpersonalaccounting/model/ReportSearch;)V", "summary", "Landroidx/lifecycle/MutableLiveData;", "", "Lme/muhammadali/qpersonalaccounting/vo/EntryDataVO;", "getSummary", "()Landroidx/lifecycle/MutableLiveData;", "uses", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "getUses", "onCleared", "", "search", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "issueDate", "Lorg/joda/time/LocalDate;", "yearMonth", "Lorg/joda/time/YearMonth;", "app_release"})
public final class CashEntryReportViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.muhammadali.qpersonalaccounting.model.repo.SummaryDataRepo repo = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.Nullable()
    private me.muhammadali.qpersonalaccounting.model.ReportSearch reportSearch;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> summary = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> uses = null;
    
    @org.jetbrains.annotations.Nullable()
    public final me.muhammadali.qpersonalaccounting.model.ReportSearch getReportSearch() {
        return null;
    }
    
    public final void setReportSearch(@org.jetbrains.annotations.Nullable()
    me.muhammadali.qpersonalaccounting.model.ReportSearch p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> getUses() {
        return null;
    }
    
    public final void search() {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate issueDate) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    org.joda.time.YearMonth yearMonth) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CashEntryReportViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}