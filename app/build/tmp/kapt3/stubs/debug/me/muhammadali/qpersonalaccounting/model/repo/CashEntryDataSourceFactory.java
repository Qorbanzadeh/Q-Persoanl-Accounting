package me.muhammadali.qpersonalaccounting.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/repo/CashEntryDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lme/muhammadali/qpersonalaccounting/vo/GroupingVO;", "dao", "Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;", "sch", "Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;", "(Lme/muhammadali/qpersonalaccounting/model/dao/CashEntryDao;Lme/muhammadali/qpersonalaccounting/model/CashEntrySearch;)V", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class CashEntryDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, me.muhammadali.qpersonalaccounting.vo.GroupingVO> {
    private final me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao dao = null;
    private final me.muhammadali.qpersonalaccounting.model.CashEntrySearch sch = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, me.muhammadali.qpersonalaccounting.vo.GroupingVO> create() {
        return null;
    }
    
    public CashEntryDataSourceFactory(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao dao, @org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.CashEntrySearch sch) {
        super();
    }
}