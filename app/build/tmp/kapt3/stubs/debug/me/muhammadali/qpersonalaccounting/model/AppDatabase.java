package me.muhammadali.qpersonalaccounting.model;

import java.lang.System;

@androidx.room.TypeConverters(value = {me.muhammadali.qpersonalaccounting.model.DateConverter.class, me.muhammadali.qpersonalaccounting.model.CategoryTypeConverter.class})
@androidx.room.Database(entities = {me.muhammadali.qpersonalaccounting.model.entity.Category.class, me.muhammadali.qpersonalaccounting.model.entity.CashEntry.class, me.muhammadali.qpersonalaccounting.model.entity.Income.class, me.muhammadali.qpersonalaccounting.model.entity.Expense.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cashEntryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "categoryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "summaryDataDao", "Lme/muhammadali/qpersonalaccounting/model/dao/SummaryDataDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "qpersonalaccounting";
    public static final me.muhammadali.qpersonalaccounting.model.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.dao.CategoryDao categoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao cashEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao summaryDataDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "create", "Lme/muhammadali/qpersonalaccounting/model/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final me.muhammadali.qpersonalaccounting.model.AppDatabase create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}