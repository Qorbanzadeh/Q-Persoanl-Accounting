package me.muhammadali.qpersonalaccounting

import android.app.Application
import android.content.Context
import me.muhammadali.qpersonalaccounting.model.AppDatabase
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao
import me.muhammadali.qpersonalaccounting.model.dao.CategoryDao
import me.muhammadali.qpersonalaccounting.model.repo.CashEntryRepo
import me.muhammadali.qpersonalaccounting.model.repo.CategoryRepo
import me.muhammadali.qpersonalaccounting.model.repo.SummaryDataRepo
import java.util.concurrent.Executors

interface ServiceLocator {

    companion object {
        private val LOCK = Any()
        private var instance: ServiceLocator? = null

        fun instance(context: Context): ServiceLocator {
            synchronized(LOCK) {
                if (instance == null) {
                    instance = DefaultServiceLocator(context.applicationContext as Application)
                }
            }

            return instance!!
        }
    }

    val categoryDao: CategoryDao

    val cashEntryDao: CashEntryDao

    val categoryRepo: CategoryRepo

    val cashEntryRepo: CashEntryRepo

    val summaryDataRepo: SummaryDataRepo

    fun closeDatabase()

    fun initDatabase()

    open class DefaultServiceLocator(val app: Application) : ServiceLocator {

        private var database = AppDatabase.create(app)

        override val categoryDao: CategoryDao = database.categoryDao()

        override val cashEntryDao: CashEntryDao = database.cashEntryDao()

        override val categoryRepo: CategoryRepo
            get() = CategoryRepo(database.categoryDao())

        override val cashEntryRepo: CashEntryRepo
            get() = CashEntryRepo(database.cashEntryDao(), Executors.newFixedThreadPool(3))

        override val summaryDataRepo: SummaryDataRepo
            get() = SummaryDataRepo(database.summaryDataDao())

        override fun closeDatabase() {
            database.close()
        }

        override fun initDatabase() {
            database = AppDatabase.create(app)
        }

    }

}