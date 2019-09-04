package me.muhammadali.qpersonalaccounting.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryRepo;", "", "dao", "Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "executor", "Ljava/util/concurrent/Executor;", "(Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;Ljava/util/concurrent/Executor;)V", "delete", "Lio/reactivex/Completable;", "entryId", "", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "entry", "Lme/muhammadali/qpersonalaccounting/model/entity/CashEntry;", "getCashEntry", "Lio/reactivex/Single;", "id", "getCashEntryWithCategory", "Lio/reactivex/Flowable;", "Landroidx/paging/PagedList;", "Lme/muhammadali/qpersonalaccounting/vo/GroupingVO;", "search", "Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;", "save", "app_release"})
public final class CashEntryRepo {
    private final me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao dao = null;
    private final java.util.concurrent.Executor executor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<me.muhammadali.qpersonalaccounting.model.entity.CashEntry> getCashEntry(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<androidx.paging.PagedList<me.muhammadali.qpersonalaccounting.vo.GroupingVO>> getCashEntryWithCategory(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.CashEntrySearch search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable save(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.CashEntry entry, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.CashEntry entry, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable delete(long entryId, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        return null;
    }
    
    public CashEntryRepo(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao dao, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
}