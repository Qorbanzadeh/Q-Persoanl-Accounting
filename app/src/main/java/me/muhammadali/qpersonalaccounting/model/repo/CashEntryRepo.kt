package me.muhammadali.qpersonalaccounting.model.repo

import androidx.paging.PagedList
import androidx.paging.toFlowable
import me.muhammadali.qpersonalaccounting.model.CashEntrySearch
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao
import me.muhammadali.qpersonalaccounting.model.entity.CashEntry
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.model.entity.Expense
import me.muhammadali.qpersonalaccounting.model.entity.Income
import me.muhammadali.qpersonalaccounting.vo.GroupingVO
import io.reactivex.Completable
import io.reactivex.Flowable
import java.util.concurrent.Executor

class CashEntryRepo(private val dao: CashEntryDao, private val executor: Executor) {

    fun getCashEntry(id: Long) = dao.getCashEntry(id)

    fun getCashEntryWithCategory(search: CashEntrySearch): Flowable<PagedList<GroupingVO>> {
        val sourceFactory = CashEntryDataSourceFactory(dao, search)
        return sourceFactory.toFlowable(50)
    }

    fun save(entry: CashEntry, type: Category.Type): Completable {
        return Completable.create {
            try {
                val clazz = when (type) {
                    Category.Type.INCOME -> Income::class
                    Category.Type.EXPENSE -> Expense::class
                }

                dao.saveEntry(entry, clazz)
                it.onComplete()
            } catch (e: Exception) {
                it.onError(e)
            }
        }
    }

    fun delete(entry: CashEntry, type: Category.Type): Completable {
        return Completable.create {
            try {
                val clazz = when (type) {
                    Category.Type.INCOME -> Income::class
                    Category.Type.EXPENSE -> Expense::class
                }

                dao.deleteEntry(entry, clazz)
                it.onComplete()
            } catch (e: Exception) {
                e.printStackTrace()
                it.onError(e)
            }
        }
    }

    fun delete(entryId: Long, type: Category.Type): Completable {
        return Completable.create {
            try {
                val clazz = when (type) {
                    Category.Type.INCOME -> Income::class
                    Category.Type.EXPENSE -> Expense::class
                }

                dao.deleteEntry(entryId, clazz)
                it.onComplete()
            } catch (e: Exception) {
                e.printStackTrace()
                it.onError(e)
            }
        }
    }

}