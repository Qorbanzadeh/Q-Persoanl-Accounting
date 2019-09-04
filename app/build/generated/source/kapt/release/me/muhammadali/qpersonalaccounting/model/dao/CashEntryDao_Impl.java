package me.muhammadali.qpersonalaccounting.model.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.reflect.KClass;
import me.muhammadali.qpersonalaccounting.model.DateConverter;
import me.muhammadali.qpersonalaccounting.model.entity.CashEntry;
import me.muhammadali.qpersonalaccounting.model.entity.Expense;
import me.muhammadali.qpersonalaccounting.model.entity.Income;
import me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO;
import org.joda.time.LocalDate;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CashEntryDao_Impl extends CashEntryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCashEntry;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityInsertionAdapter __insertionAdapterOfIncome;

  private final EntityInsertionAdapter __insertionAdapterOfExpense;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCashEntry;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfIncome;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfExpense;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCashEntry;

  public CashEntryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCashEntry = new EntityInsertionAdapter<CashEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cash_entry`(`id`,`title`,`amount`,`description`,`year`,`month`,`issue_date`,`category_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CashEntry value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindDouble(3, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getYear());
        stmt.bindLong(6, value.getMonth());
        final long _tmp;
        _tmp = __dateConverter.dateToLong(value.getIssueDate());
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getCategoryId());
      }
    };
    this.__insertionAdapterOfIncome = new EntityInsertionAdapter<Income>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Income`(`id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Income value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__insertionAdapterOfExpense = new EntityInsertionAdapter<Expense>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Expense`(`id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Expense value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfCashEntry = new EntityDeletionOrUpdateAdapter<CashEntry>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cash_entry` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CashEntry value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfIncome = new EntityDeletionOrUpdateAdapter<Income>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Income` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Income value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__deletionAdapterOfExpense = new EntityDeletionOrUpdateAdapter<Expense>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Expense` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Expense value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCashEntry = new EntityDeletionOrUpdateAdapter<CashEntry>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `cash_entry` SET `id` = ?,`title` = ?,`amount` = ?,`description` = ?,`year` = ?,`month` = ?,`issue_date` = ?,`category_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CashEntry value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindDouble(3, value.getAmount());
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getYear());
        stmt.bindLong(6, value.getMonth());
        final long _tmp;
        _tmp = __dateConverter.dateToLong(value.getIssueDate());
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getCategoryId());
        stmt.bindLong(9, value.getId());
      }
    };
  }

  @Override
  public void insert(final CashEntry entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCashEntry.insert(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<? extends CashEntry> entities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCashEntry.insert(entities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable insertAsync(final CashEntry entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCashEntry.insert(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public long insertAndGet(final CashEntry entry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCashEntry.insertAndReturnId(entry);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertIncome(final Income income) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfIncome.insert(income);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertExpense(final Expense expense) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExpense.insert(expense);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CashEntry entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCashEntry.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable deleteAsync(final CashEntry entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCashEntry.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void deleteIncome(final Income income) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfIncome.handle(income);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteExpense(final Expense expense) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExpense.handle(expense);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CashEntry entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCashEntry.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable updateAsync(final CashEntry entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCashEntry.handle(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void saveEntry(final CashEntry entry, final KClass<?> kClass) {
    __db.beginTransaction();
    try {
      CashEntryDao_Impl.super.saveEntry(entry, kClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteEntry(final CashEntry entry, final KClass<?> kClass) {
    __db.beginTransaction();
    try {
      CashEntryDao_Impl.super.deleteEntry(entry, kClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteEntry(final long entryId, final KClass<?> kClass) {
    __db.beginTransaction();
    try {
      CashEntryDao_Impl.super.deleteEntry(entryId, kClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Income getIncomeSync(final long id) {
    final String _sql = "SELECT * FROM INCOME WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final Income _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result = new Income(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Expense getExpenseSync(final long id) {
    final String _sql = "SELECT * FROM EXPENSE WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final Expense _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result = new Expense(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<CashEntry> getCashEntry(final long id) {
    final String _sql = "SELECT * FROM CASH_ENTRY WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return Single.fromCallable(new Callable<CashEntry>() {
      @Override
      public CashEntry call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
          final int _cursorIndexOfIssueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "issue_date");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final CashEntry _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final int _tmpMonth;
            _tmpMonth = _cursor.getInt(_cursorIndexOfMonth);
            final LocalDate _tmpIssueDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfIssueDate);
            _tmpIssueDate = __dateConverter.fromLong(_tmp);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            _result = new CashEntry(_tmpId,_tmpTitle,_tmpAmount,_tmpDescription,_tmpYear,_tmpMonth,_tmpIssueDate,_tmpCategoryId);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public CashEntry getCashEntrySync(final long id) {
    final String _sql = "SELECT * FROM CASH_ENTRY WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
      final int _cursorIndexOfIssueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "issue_date");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final CashEntry _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final double _tmpAmount;
        _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final int _tmpYear;
        _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        final int _tmpMonth;
        _tmpMonth = _cursor.getInt(_cursorIndexOfMonth);
        final LocalDate _tmpIssueDate;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfIssueDate);
        _tmpIssueDate = __dateConverter.fromLong(_tmp);
        final int _tmpCategoryId;
        _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        _result = new CashEntry(_tmpId,_tmpTitle,_tmpAmount,_tmpDescription,_tmpYear,_tmpMonth,_tmpIssueDate,_tmpCategoryId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CashEntry> getAllCashEntrySync(final int offset) {
    final String _sql = "SELECT * FROM CASH_ENTRY LIMIT 25 OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, offset);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
      final int _cursorIndexOfIssueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "issue_date");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
      final List<CashEntry> _result = new ArrayList<CashEntry>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CashEntry _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final double _tmpAmount;
        _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final int _tmpYear;
        _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        final int _tmpMonth;
        _tmpMonth = _cursor.getInt(_cursorIndexOfMonth);
        final LocalDate _tmpIssueDate;
        final long _tmp;
        _tmp = _cursor.getLong(_cursorIndexOfIssueDate);
        _tmpIssueDate = __dateConverter.fromLong(_tmp);
        final int _tmpCategoryId;
        _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        _item = new CashEntry(_tmpId,_tmpTitle,_tmpAmount,_tmpDescription,_tmpYear,_tmpMonth,_tmpIssueDate,_tmpCategoryId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CashEntryWithCategoryVO> findCashEntryWithCategorySync(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "title");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndex(_cursor, "date");
      final int _cursorIndexOfAmount = CursorUtil.getColumnIndex(_cursor, "amount");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndex(_cursor, "color");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndex(_cursor, "category");
      final List<CashEntryWithCategoryVO> _result = new ArrayList<CashEntryWithCategoryVO>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CashEntryWithCategoryVO _item;
        final long _tmpId;
        if (_cursorIndexOfId == -1) {
          _tmpId = 0;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpTitle;
        if (_cursorIndexOfTitle == -1) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final LocalDate _tmpDate;
        if (_cursorIndexOfDate == -1) {
          _tmpDate = null;
        } else {
          final long _tmp;
          _tmp = _cursor.getLong(_cursorIndexOfDate);
          _tmpDate = __dateConverter.fromLong(_tmp);
        }
        final double _tmpAmount;
        if (_cursorIndexOfAmount == -1) {
          _tmpAmount = 0;
        } else {
          _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
        }
        final String _tmpColor;
        if (_cursorIndexOfColor == -1) {
          _tmpColor = null;
        } else {
          _tmpColor = _cursor.getString(_cursorIndexOfColor);
        }
        final String _tmpCategory;
        if (_cursorIndexOfCategory == -1) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        _item = new CashEntryWithCategoryVO(_tmpId,_tmpTitle,_tmpDate,_tmpAmount,_tmpColor,_tmpCategory);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }
}
