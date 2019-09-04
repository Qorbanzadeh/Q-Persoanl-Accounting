package me.muhammadali.qpersonalaccounting.model.dao

import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import me.muhammadali.qpersonalaccounting.model.entity.CashEntry
import me.muhammadali.qpersonalaccounting.model.entity.Expense
import me.muhammadali.qpersonalaccounting.model.entity.Income
import me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO
import io.reactivex.Single
import kotlin.reflect.KClass

@Dao
abstract class CashEntryDao : BaseDao<CashEntry>, CudDao<CashEntry> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertAndGet(entry: CashEntry): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertIncome(income: Income)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertExpense(expense: Expense)

    @Delete
    abstract fun deleteIncome(income: Income)

    @Delete
    abstract fun deleteExpense(expense: Expense)

    @Query("SELECT * FROM INCOME WHERE id = :id LIMIT 1")
    abstract fun getIncomeSync(id: Long): Income?

    @Query("SELECT * FROM EXPENSE WHERE id = :id LIMIT 1")
    abstract fun getExpenseSync(id: Long): Expense?

    @Query("SELECT * FROM CASH_ENTRY WHERE id = :id LIMIT 1")
    abstract fun getCashEntry(id: Long): Single<CashEntry>

    @Query("SELECT * FROM CASH_ENTRY WHERE id = :id LIMIT 1")
    abstract fun getCashEntrySync(id: Long): CashEntry?

    @RawQuery
    abstract fun findCashEntryWithCategorySync(query: SupportSQLiteQuery): List<CashEntryWithCategoryVO>

    @Query("SELECT * FROM CASH_ENTRY LIMIT 25 OFFSET :offset")
    abstract fun getAllCashEntrySync(offset: Int): List<CashEntry>

    @Transaction
    open fun saveEntry(entry: CashEntry, kClass: KClass<*>) {
        var id = entry.id

        entry.year = entry.issueDate.year
        entry.month = entry.issueDate.monthOfYear

        if (id > 0) {
            update(entry)
            when (kClass) {
                Income::class -> {
                    getExpenseSync(entry.id)?.also {
                        deleteExpense(it)
                        insertIncome(Income(id))
                    }
                }
                Expense::class -> {
                    getIncomeSync(entry.id)?.also {
                        deleteIncome(it)
                        insertExpense(Expense(id))
                    }
                }
            }
        } else {
            id = insertAndGet(entry)
            when (kClass) {
                Income::class -> insertIncome(Income(id))
                Expense::class -> insertExpense(Expense(id))
            }
        }
    }

    @Transaction
    open fun deleteEntry(entry: CashEntry, kClass: KClass<*>) {
        when (kClass) {
            Income::class -> getIncomeSync(entry.id)?.also { deleteIncome(it) }
            Expense::class -> getExpenseSync(entry.id)?.also { deleteExpense(it) }
        }

        delete(entry)
    }

    @Transaction
    open fun deleteEntry(entryId: Long, kClass: KClass<*>) {
        when (kClass) {
            Income::class -> getIncomeSync(entryId)?.also { deleteIncome(it) }
            Expense::class -> getExpenseSync(entryId)?.also { deleteExpense(it) }
        }

        getCashEntrySync(entryId)?.also { delete(it) }
    }

}