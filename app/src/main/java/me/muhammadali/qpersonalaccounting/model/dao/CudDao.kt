package me.muhammadali.qpersonalaccounting.model.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import io.reactivex.Completable

interface CudDao<in E> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAsync(entity: E): Completable

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateAsync(entity: E): Completable

    @Delete
    fun deleteAsync(entity: E): Completable

}