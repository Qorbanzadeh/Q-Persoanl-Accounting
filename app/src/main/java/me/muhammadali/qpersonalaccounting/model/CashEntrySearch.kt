package me.muhammadali.qpersonalaccounting.model

import androidx.sqlite.db.SimpleSQLiteQuery
import me.muhammadali.qpersonalaccounting.model.entity.Category
import org.joda.time.LocalDate

class CashEntrySearch(
    var from: LocalDate? = null,
    var to: LocalDate? = null,
    var type: Category.Type = Category.Type.EXPENSE
) {
    companion object {
        const val baseSql = "SELECT e.id, e.title, e.issue_date as date, e.amount, c.color, c.name AS category FROM CASH_ENTRY e "
    }

    fun getQuery(offset: Int = 0): SimpleSQLiteQuery {
        val joinSql = when (type) {
            Category.Type.INCOME -> "INNER JOIN INCOME i ON i.id = e.id "
            Category.Type.EXPENSE -> "INNER JOIN EXPENSE ep ON ep.id = e.id "
        }

        val offsetSql = if (offset > 0) "OFFSET $offset " else ""

        val sql = "$baseSql $joinSql " +
                "INNER JOIN CATEGORY c ON c.id = e.category_id WHERE 1 = 1 ${getWhere()} " +
                "ORDER BY e.issue_date DESC LIMIT 25 $offsetSql"
        return SimpleSQLiteQuery(sql, getParams())
    }

    private fun getWhere(): String {
        val sb = StringBuilder()
        from?.also { sb.append("AND e.issue_date >= ? ") }
        to?.also { sb.append("AND e.issue_date <= ? ") }
        return sb.toString()
    }

    private fun getParams(): Array<Any> {
        val params = arrayListOf<Any>()

        from?.also { params.add(it.toDate().time) }
        to?.also { params.add(it.toDate().time) }
        return params.toTypedArray()
    }

}