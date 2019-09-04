package me.muhammadali.qpersonalaccounting.model.repo

import androidx.paging.PageKeyedDataSource
import me.muhammadali.qpersonalaccounting.model.CashEntrySearch
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao
import me.muhammadali.qpersonalaccounting.util.toDefaultFormat
import me.muhammadali.qpersonalaccounting.vo.CashEntryHeaderVO
import me.muhammadali.qpersonalaccounting.vo.GroupingVO

class CashEntryDataSource(
    private val dao: CashEntryDao,
    private val sch: CashEntrySearch
) : PageKeyedDataSource<Int, GroupingVO>() {

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, GroupingVO>) {
    }

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, GroupingVO>
    ) {
        val list = dao.findCashEntryWithCategorySync(sch.getQuery(0))
        val map = list.groupBy { it.date }

        val entries = arrayListOf<GroupingVO>()

        map.keys.sortedDescending().forEach { key ->
            entries.add(CashEntryHeaderVO(key.toDefaultFormat()))
            entries.addAll(map[key]!!)
        }

        callback.onResult(entries, 0, 1)
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, GroupingVO>) {
        val offset = (params.key * 25) + 1
        val list = dao.findCashEntryWithCategorySync(sch.getQuery(offset))
        val map = list.groupBy { it.date }

        val entries = arrayListOf<GroupingVO>()

        map.keys.sortedDescending().forEach { key ->
            entries.add(CashEntryHeaderVO(key.toDefaultFormat()))
            entries.addAll(map[key]!!)
        }

        callback.onResult(entries, params.key + 1)
    }
}