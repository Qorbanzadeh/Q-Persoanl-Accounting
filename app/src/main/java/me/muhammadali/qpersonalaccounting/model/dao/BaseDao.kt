package me.muhammadali.qpersonalaccounting.model.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<E> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: E)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: List<E>)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(entity: E)

    @Delete
    fun delete(entity: E)

}