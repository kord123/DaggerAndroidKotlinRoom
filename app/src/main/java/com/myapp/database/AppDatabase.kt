package com.myapp.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.myapp.database.dao.DataEntityDao
import com.myapp.database.entity.DataEntity

@Database(entities = [DataEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun dataEntityDao(): DataEntityDao
}