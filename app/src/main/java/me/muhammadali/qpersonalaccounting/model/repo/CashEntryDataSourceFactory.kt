package me.muhammadali.qpersonalaccounting.model.repo

import androidx.paging.DataSource
import me.muhammadali.qpersonalaccounting.model.CashEntrySearch
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao
import me.muhammadali.qpersonalaccounting.vo.GroupingVO

class CashEntryDataSourceFactory(
    private val dao: CashEntryDao,
    private val sch: CashEntrySearch
) : DataSource.Factory<Int, GroupingVO>() {
    override fun create(): DataSource<Int, GroupingVO> {
        return CashEntryDataSource(dao, sch)
    }
}