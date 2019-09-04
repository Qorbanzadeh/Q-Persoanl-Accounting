package me.muhammadali.qpersonalaccounting.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006J\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "", "dao", "Lme/muhammadali/qpersonalaccounting/model/dao/SummaryDataDao;", "(Lme/muhammadali/qpersonalaccounting/model/dao/SummaryDataDao;)V", "getCategorySummary", "Lio/reactivex/Flowable;", "", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "search", "Lme/muhammadali/qpersonalaccounting/model/ReportSearch;", "getExpenseSummary", "Lme/muhammadali/qpersonalaccounting/vo/EntryDataVO;", "getReportSummary", "getTimelyExpenseSummary", "Lme/muhammadali/qpersonalaccounting/vo/TimelyEntryDataVO;", "year", "", "getTotalExpense", "", "getTotalIncome", "app_debug"})
public final class SummaryDataRepo {
    private final me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.Double> getTotalIncome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.Double> getTotalExpense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> getExpenseSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> getReportSummary(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.ReportSearch search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> getCategorySummary(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.ReportSearch search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO>> getTimelyExpenseSummary(int year) {
        return null;
    }
    
    public SummaryDataRepo(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao dao) {
        super();
    }
}