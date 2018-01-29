package com.myapp.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.myapp.database.entity.DataEntity

@Dao
interface DataEntityDao {
    @Query("SELECT * FROM dataEntity")
    fun getAll(): LiveData<List<DataEntity>>

    @Query("SELECT * FROM dataEntity WHERE id IN (:ids)")
    fun loadAllByIds(ids: IntArray): List<DataEntity>

    @Insert
    fun insertAll(vararg entities: DataEntity): Array<Long>

    @Delete
    fun delete(entity: DataEntity)
}