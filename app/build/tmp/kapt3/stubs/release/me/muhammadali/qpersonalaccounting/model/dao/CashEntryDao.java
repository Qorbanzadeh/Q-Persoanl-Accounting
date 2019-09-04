package me.muhammadali.qpersonalaccounting.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0017J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0017J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\bH\'J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\bH\'J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\bH\'J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\'J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u001c\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0017\u00a8\u0006$"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "Lme/muhammadali/qpersonalaccounting/model/dao/BaseDao;", "Lme/muhammadali/qpersonalaccounting/model/entity/CashEntry;", "Lme/muhammadali/qpersonalaccounting/model/dao/CudDao;", "()V", "deleteEntry", "", "entryId", "", "kClass", "Lkotlin/reflect/KClass;", "entry", "deleteExpense", "expense", "Lme/muhammadali/qpersonalaccounting/model/entity/Expense;", "deleteIncome", "income", "Lme/muhammadali/qpersonalaccounting/model/entity/Income;", "findCashEntryWithCategorySync", "", "Lme/muhammadali/qpersonalaccounting/vo/CashEntryWithCategoryVO;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getAllCashEntrySync", "offset", "", "getCashEntry", "Lio/reactivex/Single;", "id", "getCashEntrySync", "getExpenseSync", "getIncomeSync", "insertAndGet", "insertExpense", "insertIncome", "saveEntry", "app_release"})
public abstract class CashEntryDao implements me.muhammadali.qpersonalaccounting.model.dao.BaseDao<me.muhammadali.qpersonalaccounting.model.entity.CashEntry>, me.muhammadali.qpersonalaccounting.model.dao.CudDao<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertAndGet(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.CashEntry entry);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertIncome(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Income income);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertExpense(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Expense expense);
    
    @androidx.room.Delete()
    public abstract void deleteIncome(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Income income);
    
    @androidx.room.Delete()
    public abstract void deleteExpense(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Expense expense);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM INCOME WHERE id = :id LIMIT 1")
    public abstract me.muhammadali.qpersonalaccounting.model.entity.Income getIncomeSync(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM EXPENSE WHERE id = :id LIMIT 1")
    public abstract me.muhammadali.qpersonalaccounting.model.entity.Expense getExpenseSync(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CASH_ENTRY WHERE id = :id LIMIT 1")
    public abstract io.reactivex.Single<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> getCashEntry(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM CASH_ENTRY WHERE id = :id LIMIT 1")
    public abstract me.muhammadali.qpersonalaccounting.model.entity.CashEntry getCashEntrySync(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery()
    public abstract java.util.List<me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO> findCashEntryWithCategorySync(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CASH_ENTRY LIMIT 25 OFFSET :offset")
    public abstract java.util.List<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> getAllCashEntrySync(int offset);
    
    @androidx.room.Transaction()
    public void saveEntry(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.CashEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<?> kClass) {
    }
    
    @androidx.room.Transaction()
    public void deleteEntry(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.CashEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<?> kClass) {
    }
    
    @androidx.room.Transaction()
    public void deleteEntry(long entryId, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<?> kClass) {
    }
    
    public CashEntryDao() {
        super();
    }
}