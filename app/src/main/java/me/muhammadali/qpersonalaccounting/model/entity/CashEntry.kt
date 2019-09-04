package me.muhammadali.qpersonalaccounting.model.entity

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.room.*
import org.joda.time.LocalDate

@Entity(
    tableName = "cash_entry",
    foreignKeys = [ForeignKey(
        entity = Category::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("category_id"))],
    indices = [Index(value = ["category_id"])]
)
data class CashEntry(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var title: String,
    var amount: Double,
    var description: String,
    var year: Int,
    var month: Int,
    @get:Bindable
    @ColumnInfo(name = "issue_date")
    var issueDate: LocalDate,
    @ColumnInfo(name = "category_id")
    var categoryId: Int
): BaseObservable() {
    constructor() : this(0, "", 0.0, "", 0, 0, LocalDate.now(), 0)
}