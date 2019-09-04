package me.muhammadali.qpersonalaccounting.model.dao

import androidx.room.Dao
import androidx.room.Query
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO
import me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO
import io.reactivex.Flowable
import org.joda.time.LocalDate

@Dao
interface SummaryDataDao {

    @Query("SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e " +
            "INNER JOIN INCOME i ON i.id = e.id")
    fun findTotalIncome(): Flowable<Double>

    @Query("SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e " +
            "INNER JOIN EXPENSE ep ON ep.id = e.id")
    fun findTotalExpense(): Flowable<Double>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN INCOME i ON i.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "GROUP BY c.id, c.name, c.color")
    fun findIncomeSummary(): Flowable<List<EntryDataVO>>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN INCOME i ON i.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "WHERE e.year = :year and e.month = :month " +
            "GROUP BY c.id, c.name, c.color")
    fun findIncomeSummary(year:Int, month: Int): Flowable<List<EntryDataVO>>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN INCOME i ON i.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "WHERE e.issue_date = :issueDate " +
            "GROUP BY c.id, c.name, c.color")
    fun findIncomeSummary(issueDate: LocalDate): Flowable<List<EntryDataVO>>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN EXPENSE ep ON ep.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "GROUP BY c.id, c.name, c.color")
    fun findExpenseSummary(): Flowable<List<EntryDataVO>>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN EXPENSE ep ON ep.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "WHERE e.year = :year and e.month = :month " +
            "GROUP BY c.id, c.name, c.color")
    fun findExpenseSummary(year:Int, month: Int): Flowable<List<EntryDataVO>>

    @Query("SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN EXPENSE ep ON ep.id = e.id " +
            "INNER JOIN CATEGORY c ON c.id = e.category_id " +
            "WHERE e.issue_date = :issueDate " +
            "GROUP BY c.id, c.name, c.color")
    fun findExpenseSummary(issueDate: LocalDate): Flowable<List<EntryDataVO>>

    @Query("SELECT COALESCE(SUM(e.amount), 0) AS amount, e.month as time " +
            "FROM CASH_ENTRY e " +
            "INNER JOIN EXPENSE ep ON ep.id = e.id " +
            "WHERE e.year = :year " +
            "GROUP BY e.month ORDER BY e.month ASC")
    fun findTimelyExpenseSummary(year: Int): Flowable<List<TimelyEntryDataVO>>

    @Query("SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c " +
            "INNER JOIN CASH_ENTRY e ON c.id = e.category_id " +
            "WHERE c.type = :type and e.issue_date = :issueDate " +
            "GROUP BY c.id, c.name, c.color")
    fun findCategoriesWithAmountByTypeAndDate(type: Category.Type, issueDate: LocalDate): Flowable<List<CategoryWithAmountVO>>


    @Query("SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c " +
            "INNER JOIN CASH_ENTRY e ON c.id = e.category_id " +
            "WHERE c.type = :type and e.year = :year and e.month = :month " +
            "GROUP BY c.id, c.name, c.color")
    fun findCategoriesWithAmountByTypeAndMonth(type: Category.Type, year:Int, month: Int): Flowable<List<CategoryWithAmountVO>>

}