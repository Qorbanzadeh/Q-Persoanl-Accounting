package me.muhammadali.qpersonalaccounting.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao;
import me.muhammadali.qpersonalaccounting.model.dao.CashEntryDao_Impl;
import me.muhammadali.qpersonalaccounting.model.dao.CategoryDao;
import me.muhammadali.qpersonalaccounting.model.dao.CategoryDao_Impl;
import me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao;
import me.muhammadali.qpersonalaccounting.model.dao.SummaryDataDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CategoryDao _categoryDao;

  private volatile CashEntryDao _cashEntryDao;

  private volatile SummaryDataDao _summaryDataDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Category` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `color` TEXT NOT NULL, `type` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_Category_name` ON `Category` (`name`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cash_entry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `amount` REAL NOT NULL, `description` TEXT NOT NULL, `year` INTEGER NOT NULL, `month` INTEGER NOT NULL, `issue_date` INTEGER NOT NULL, `category_id` INTEGER NOT NULL, FOREIGN KEY(`category_id`) REFERENCES `Category`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE  INDEX `index_cash_entry_category_id` ON `cash_entry` (`category_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Income` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`id`) REFERENCES `cash_entry`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Expense` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`id`) REFERENCES `cash_entry`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5eb497f2c044061514d84dbc4c03ec71')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Category`");
        _db.execSQL("DROP TABLE IF EXISTS `cash_entry`");
        _db.execSQL("DROP TABLE IF EXISTS `Income`");
        _db.execSQL("DROP TABLE IF EXISTS `Expense`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCategory = new HashMap<String, TableInfo.Column>(4);
        _columnsCategory.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCategory.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsCategory.put("color", new TableInfo.Column("color", "TEXT", true, 0));
        _columnsCategory.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategory = new HashSet<TableInfo.Index>(1);
        _indicesCategory.add(new TableInfo.Index("index_Category_name", true, Arrays.asList("name")));
        final TableInfo _infoCategory = new TableInfo("Category", _columnsCategory, _foreignKeysCategory, _indicesCategory);
        final TableInfo _existingCategory = TableInfo.read(_db, "Category");
        if (! _infoCategory.equals(_existingCategory)) {
          throw new IllegalStateException("Migration didn't properly handle Category(me.muhammadali.qpersonalaccounting.model.entity.Category).\n"
                  + " Expected:\n" + _infoCategory + "\n"
                  + " Found:\n" + _existingCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsCashEntry = new HashMap<String, TableInfo.Column>(8);
        _columnsCashEntry.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCashEntry.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsCashEntry.put("amount", new TableInfo.Column("amount", "REAL", true, 0));
        _columnsCashEntry.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsCashEntry.put("year", new TableInfo.Column("year", "INTEGER", true, 0));
        _columnsCashEntry.put("month", new TableInfo.Column("month", "INTEGER", true, 0));
        _columnsCashEntry.put("issue_date", new TableInfo.Column("issue_date", "INTEGER", true, 0));
        _columnsCashEntry.put("category_id", new TableInfo.Column("category_id", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCashEntry = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysCashEntry.add(new TableInfo.ForeignKey("Category", "NO ACTION", "NO ACTION",Arrays.asList("category_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesCashEntry = new HashSet<TableInfo.Index>(1);
        _indicesCashEntry.add(new TableInfo.Index("index_cash_entry_category_id", false, Arrays.asList("category_id")));
        final TableInfo _infoCashEntry = new TableInfo("cash_entry", _columnsCashEntry, _foreignKeysCashEntry, _indicesCashEntry);
        final TableInfo _existingCashEntry = TableInfo.read(_db, "cash_entry");
        if (! _infoCashEntry.equals(_existingCashEntry)) {
          throw new IllegalStateException("Migration didn't properly handle cash_entry(me.muhammadali.qpersonalaccounting.model.entity.CashEntry).\n"
                  + " Expected:\n" + _infoCashEntry + "\n"
                  + " Found:\n" + _existingCashEntry);
        }
        final HashMap<String, TableInfo.Column> _columnsIncome = new HashMap<String, TableInfo.Column>(1);
        _columnsIncome.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIncome = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysIncome.add(new TableInfo.ForeignKey("cash_entry", "NO ACTION", "NO ACTION",Arrays.asList("id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesIncome = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIncome = new TableInfo("Income", _columnsIncome, _foreignKeysIncome, _indicesIncome);
        final TableInfo _existingIncome = TableInfo.read(_db, "Income");
        if (! _infoIncome.equals(_existingIncome)) {
          throw new IllegalStateException("Migration didn't properly handle Income(me.muhammadali.qpersonalaccounting.model.entity.Income).\n"
                  + " Expected:\n" + _infoIncome + "\n"
                  + " Found:\n" + _existingIncome);
        }
        final HashMap<String, TableInfo.Column> _columnsExpense = new HashMap<String, TableInfo.Column>(1);
        _columnsExpense.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExpense = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysExpense.add(new TableInfo.ForeignKey("cash_entry", "NO ACTION", "NO ACTION",Arrays.asList("id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesExpense = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExpense = new TableInfo("Expense", _columnsExpense, _foreignKeysExpense, _indicesExpense);
        final TableInfo _existingExpense = TableInfo.read(_db, "Expense");
        if (! _infoExpense.equals(_existingExpense)) {
          throw new IllegalStateException("Migration didn't properly handle Expense(me.muhammadali.qpersonalaccounting.model.entity.Expense).\n"
                  + " Expected:\n" + _infoExpense + "\n"
                  + " Found:\n" + _existingExpense);
        }
      }
    }, "5eb497f2c044061514d84dbc4c03ec71", "1c280a7a8ff1024e7ce5c21271cb6929");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Category","cash_entry","Income","Expense");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Income`");
      _db.execSQL("DELETE FROM `Expense`");
      _db.execSQL("DELETE FROM `cash_entry`");
      _db.execSQL("DELETE FROM `Category`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CategoryDao categoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public CashEntryDao cashEntryDao() {
    if (_cashEntryDao != null) {
      return _cashEntryDao;
    } else {
      synchronized(this) {
        if(_cashEntryDao == null) {
          _cashEntryDao = new CashEntryDao_Impl(this);
        }
        return _cashEntryDao;
      }
    }
  }

  @Override
  public SummaryDataDao summaryDataDao() {
    if (_summaryDataDao != null) {
      return _summaryDataDao;
    } else {
      synchronized(this) {
        if(_summaryDataDao == null) {
          _summaryDataDao = new SummaryDataDao_Impl(this);
        }
        return _summaryDataDao;
      }
    }
  }
}
