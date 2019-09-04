package me.muhammadali.qpersonalaccounting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aJ\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ServiceLocator;", "", "cashEntryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "getCashEntryDao", "()Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "cashEntryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "getCashEntryRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "categoryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "getCategoryDao", "()Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "categoryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "getCategoryRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "summaryDataRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "getSummaryDataRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "closeDatabase", "", "initDatabase", "Companion", "DefaultServiceLocator", "app_debug"})
public abstract interface ServiceLocator {
    public static final me.muhammadali.qpersonalaccounting.ServiceLocator.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.dao.CategoryDao getCategoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao getCashEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo getCategoryRepo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.repo.CashEntryRepo getCashEntryRepo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract me.muhammadali.qpersonalaccounting.model.repo.SummaryDataRepo getSummaryDataRepo();
    
    public abstract void closeDatabase();
    
    public abstract void initDatabase();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006 "}, d2 = {"Lme/muhammadali/qpersonalaccounting/ServiceLocator$DefaultServiceLocator;", "Lme/muhammadali/qpersonalaccounting/ServiceLocator;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApp", "()Landroid/app/Application;", "cashEntryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "getCashEntryDao", "()Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "cashEntryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "getCashEntryRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "categoryDao", "Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "getCategoryDao", "()Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "categoryRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "getCategoryRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "database", "Lme/muhammadali/qpersonalaccounting/model/AppDatabase;", "summaryDataRepo", "Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "getSummaryDataRepo", "()Lme/muhammadali/qpersonalaccounting/model/repo/SummaryDataRepo;", "closeDatabase", "", "initDatabase", "app_debug"})
    public static class DefaultServiceLocator implements me.muhammadali.qpersonalaccounting.ServiceLocator {
        private me.muhammadali.qpersonalaccounting.model.AppDatabase database;
        @org.jetbrains.annotations.NotNull()
        private final me.muhammadali.qpersonalaccounting.model.dao.CategoryDao categoryDao = null;
        @org.jetbrains.annotations.NotNull()
        private final me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao cashEntryDao = null;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application app = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public me.muhammadali.qpersonalaccounting.model.dao.CategoryDao getCategoryDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao getCashEntryDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo getCategoryRepo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public me.muhammadali.qpersonalaccounting.model.repo.CashEntryRepo getCashEntryRepo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public me.muhammadali.qpersonalaccounting.model.repo.SummaryDataRepo getSummaryDataRepo() {
            return null;
        }
        
        @java.lang.Override()
        public void closeDatabase() {
        }
        
        @java.lang.Override()
        public void initDatabase() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApp() {
            return null;
        }
        
        public DefaultServiceLocator(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ServiceLocator$Companion;", "", "()V", "LOCK", "instance", "Lme/muhammadali/qpersonalaccounting/ServiceLocator;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        private static final java.lang.Object LOCK = null;
        private static me.muhammadali.qpersonalaccounting.ServiceLocator instance;
        
        @org.jetbrains.annotations.NotNull()
        public final me.muhammadali.qpersonalaccounting.ServiceLocator instance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}