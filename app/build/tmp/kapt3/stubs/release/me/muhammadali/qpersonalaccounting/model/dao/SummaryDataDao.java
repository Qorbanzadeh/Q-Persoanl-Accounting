package me.muhammadali.qpersonalaccounting.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H\'J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H\'J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\'\u00a8\u0006\u0016"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/dao/SummaryDataDao;", "", "findCategoriesWithAmountByTypeAndDate", "Lio/reactivex/Flowable;", "", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "issueDate", "Lorg/joda/time/LocalDate;", "findCategoriesWithAmountByTypeAndMonth", "year", "", "month", "findExpenseSummary", "Lme/muhammadali/qpersonalaccounting/vo/EntryDataVO;", "findIncomeSummary", "findTimelyExpenseSummary", "Lme/muhammadali/qpersonalaccounting/vo/TimelyEntryDataVO;", "findTotalExpense", "", "findTotalIncome", "app_release"})
public abstract interface SummaryDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id")
    public abstract io.reactivex.Flowable<java.lang.Double> findTotalIncome();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id")
    public abstract io.reactivex.Flowable<java.lang.Double> findTotalExpense();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findIncomeSummary();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.year = :year and e.month = :month GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findIncomeSummary(int year, int month);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.issue_date = :issueDate GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findIncomeSummary(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate issueDate);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findExpenseSummary();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.year = :year and e.month = :month GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findExpenseSummary(int year, int month);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.issue_date = :issueDate GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.EntryDataVO>> findExpenseSummary(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate issueDate);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COALESCE(SUM(e.amount), 0) AS amount, e.month as time FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id WHERE e.year = :year GROUP BY e.month ORDER BY e.month ASC")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO>> findTimelyExpenseSummary(int year);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c INNER JOIN CASH_ENTRY e ON c.id = e.category_id WHERE c.type = :type and e.issue_date = :issueDate GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> findCategoriesWithAmountByTypeAndDate(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDate issueDate);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c INNER JOIN CASH_ENTRY e ON c.id = e.category_id WHERE c.type = :type and e.year = :year and e.month = :month GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> findCategoriesWithAmountByTypeAndMonth(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type, int year, int month);
}