package me.muhammadali.qpersonalaccounting.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0002\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;", "", "from", "Lorg/joda/time/LocalDate;", "to", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;)V", "getFrom", "()Lorg/joda/time/LocalDate;", "setFrom", "(Lorg/joda/time/LocalDate;)V", "getTo", "setTo", "getType", "()Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "setType", "(Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;)V", "getParams", "", "()[Ljava/lang/Object;", "getQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "offset", "", "getWhere", "", "Companion", "app_release"})
public final class CashEntrySearch {
    @org.jetbrains.annotations.Nullable()
    private org.joda.time.LocalDate from;
    @org.jetbrains.annotations.Nullable()
    private org.joda.time.LocalDate to;
    @org.jetbrains.annotations.NotNull()
    private me.muhammadali.qpersonalaccounting.model.entity.Category.Type type;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String baseSql = "SELECT e.id, e.title, e.issue_date as date, e.amount, c.color, c.name AS category FROM CASH_ENTRY e ";
    public static final me.muhammadali.qpersonalaccounting.model.CashEntrySearch.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.sqlite.db.SimpleSQLiteQuery getQuery(int offset) {
        return null;
    }
    
    private final java.lang.String getWhere() {
        return null;
    }
    
    private final java.lang.Object[] getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.joda.time.LocalDate getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.joda.time.LocalDate getTo() {
        return null;
    }
    
    public final void setTo(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.muhammadali.qpersonalaccounting.model.entity.Category.Type getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type p0) {
    }
    
    public CashEntrySearch(@org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate from, @org.jetbrains.annotations.Nullable()
    org.joda.time.LocalDate to, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        super();
    }
    
    public CashEntrySearch() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch$Companion;", "", "()V", "baseSql", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}