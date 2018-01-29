package com.myapp.database.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by andrey on 1/29/18.
 */

@Entity
class DataEntity {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    var data: String = ""
}