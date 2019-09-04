package me.muhammadali.qpersonalaccounting.model.dao;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import io.reactivex.Flowable;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import me.muhammadali.qpersonalaccounting.model.CategoryTypeConverter;
import me.muhammadali.qpersonalaccounting.model.DateConverter;
import me.muhammadali.qpersonalaccounting.model.entity.Category;
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO;
import me.muhammadali.qpersonalaccounting.vo.EntryDataVO;
import me.muhammadali.qpersonalaccounting.vo.TimelyEntryDataVO;
import org.joda.time.LocalDate;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SummaryDataDao_Impl implements SummaryDataDao {
  private final RoomDatabase __db;

  private final DateConverter __dateConverter = new DateConverter();

  private final CategoryTypeConverter __categoryTypeConverter = new CategoryTypeConverter();

  public SummaryDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Flowable<Double> findTotalIncome() {
    final String _sql = "SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","INCOME"}, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
  public Flowable<Double> findTotalExpense() {
    final String _sql = "SELECT COALESCE(SUM(e.amount), 0) FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","EXPENSE"}, new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final Double _result;
          if(_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
  public Flowable<List<EntryDataVO>> findIncomeSummary() {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","INCOME","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<EntryDataVO>> findIncomeSummary(final int year, final int month) {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.year = ? and e.month = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, year);
    _argIndex = 2;
    _statement.bindLong(_argIndex, month);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","INCOME","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<EntryDataVO>> findIncomeSummary(final LocalDate issueDate) {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN INCOME i ON i.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.issue_date = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final long _tmp;
    _tmp = __dateConverter.dateToLong(issueDate);
    _statement.bindLong(_argIndex, _tmp);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","INCOME","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<EntryDataVO>> findExpenseSummary() {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","EXPENSE","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<EntryDataVO>> findExpenseSummary(final int year, final int month) {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.year = ? and e.month = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, year);
    _argIndex = 2;
    _statement.bindLong(_argIndex, month);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","EXPENSE","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<EntryDataVO>> findExpenseSummary(final LocalDate issueDate) {
    final String _sql = "SELECT c.name AS category, c.color, COALESCE(SUM(e.amount), 0) AS amount FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id INNER JOIN CATEGORY c ON c.id = e.category_id WHERE e.issue_date = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final long _tmp;
    _tmp = __dateConverter.dateToLong(issueDate);
    _statement.bindLong(_argIndex, _tmp);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","EXPENSE","CATEGORY"}, new Callable<List<EntryDataVO>>() {
      @Override
      public List<EntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<EntryDataVO> _result = new ArrayList<EntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntryDataVO _item;
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new EntryDataVO(_tmpAmount,_tmpCategory,_tmpColor);
            _result.add(_item);
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
  public Flowable<List<TimelyEntryDataVO>> findTimelyExpenseSummary(final int year) {
    final String _sql = "SELECT COALESCE(SUM(e.amount), 0) AS amount, e.month as time FROM CASH_ENTRY e INNER JOIN EXPENSE ep ON ep.id = e.id WHERE e.year = ? GROUP BY e.month ORDER BY e.month ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, year);
    return RxRoom.createFlowable(__db, false, new String[]{"CASH_ENTRY","EXPENSE"}, new Callable<List<TimelyEntryDataVO>>() {
      @Override
      public List<TimelyEntryDataVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<TimelyEntryDataVO> _result = new ArrayList<TimelyEntryDataVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TimelyEntryDataVO _item;
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final int _tmpTime;
            _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            _item = new TimelyEntryDataVO(_tmpAmount,_tmpTime);
            _result.add(_item);
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
  public Flowable<List<CategoryWithAmountVO>> findCategoriesWithAmountByTypeAndDate(final Category.Type type,
      final LocalDate issueDate) {
    final String _sql = "SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c INNER JOIN CASH_ENTRY e ON c.id = e.category_id WHERE c.type = ? and e.issue_date = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __categoryTypeConverter.categoryTypeToString(type);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    final long _tmp_1;
    _tmp_1 = __dateConverter.dateToLong(issueDate);
    _statement.bindLong(_argIndex, _tmp_1);
    return RxRoom.createFlowable(__db, false, new String[]{"CATEGORY","CASH_ENTRY"}, new Callable<List<CategoryWithAmountVO>>() {
      @Override
      public List<CategoryWithAmountVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<CategoryWithAmountVO> _result = new ArrayList<CategoryWithAmountVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryWithAmountVO _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new CategoryWithAmountVO(_tmpId,_tmpName,_tmpColor,_tmpAmount);
            _result.add(_item);
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
  public Flowable<List<CategoryWithAmountVO>> findCategoriesWithAmountByTypeAndMonth(final Category.Type type,
      final int year, final int month) {
    final String _sql = "SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c INNER JOIN CASH_ENTRY e ON c.id = e.category_id WHERE c.type = ? and e.year = ? and e.month = ? GROUP BY c.id, c.name, c.color";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __categoryTypeConverter.categoryTypeToString(type);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, year);
    _argIndex = 3;
    _statement.bindLong(_argIndex, month);
    return RxRoom.createFlowable(__db, false, new String[]{"CATEGORY","CASH_ENTRY"}, new Callable<List<CategoryWithAmountVO>>() {
      @Override
      public List<CategoryWithAmountVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<CategoryWithAmountVO> _result = new ArrayList<CategoryWithAmountVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryWithAmountVO _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpColor;
            _tmpColor = _cursor.getString(_cursorIndexOfColor);
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            _item = new CategoryWithAmountVO(_tmpId,_tmpName,_tmpColor,_tmpAmount);
            _result.add(_item);
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
}
