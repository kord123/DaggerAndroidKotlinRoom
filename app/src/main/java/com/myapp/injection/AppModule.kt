package com.myapp.injection

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.myapp.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class AppModule {

    @Inject
    constructor()

    @Singleton
    @Provides
    fun providesAppDatabase(context: Context): AppDatabase = Room
            .databaseBuilder(context, AppDatabase::class.java, "app db")
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    loadInitialData()
                }

                override fun onOpen(db: SupportSQLiteDatabase) {
                    //do something every time database is open
                }
            })
            .build()

    private fun loadInitialData() {
        TODO("not implemented")
    }
}