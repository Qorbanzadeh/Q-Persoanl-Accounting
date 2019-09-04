package me.muhammadali.qpersonalaccounting.model

import android.content.Context
import androidx.room.*
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao
import me.muhammadali.qpersonalaccounting.model.dao.CategoryDao
import me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao
import me.muhammadali.qpersonalaccounting.model.entity.CashEntry
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.model.entity.Expense
import me.muhammadali.qpersonalaccounting.model.entity.Income
import org.joda.time.LocalDate

@Database(entities = [
    Category::class,
    CashEntry::class,
    Income::class,
    Expense::class
], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, CategoryTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "qpersonalaccounting"

        fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .build()
        }
    }

    abstract fun categoryDao(): CategoryDao

    abstract fun cashEntryDao(): CashEntryDao

    abstract fun summaryDataDao(): SummaryDataDao
}

class DateConverter {

    @TypeConverter
    fun fromLong(value: Long): LocalDate {
        return LocalDate(value)
    }

    @TypeConverter
    fun dateToLong(date: LocalDate): Long {
        return date.toDate().time
    }

}

class CategoryTypeConverter {

    @TypeConverter
    fun stringToCategoryType(value: String): Category.Type {
        return Category.Type.valueOf(value)
    }

    @TypeConverter
    fun categoryTypeToString(type: Category.Type): String {
        return type.name
    }

}

