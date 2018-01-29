package com.myapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.myapp.database.AppDatabase
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MyFragment : DaggerFragment() {

    @Inject
    protected lateinit var appDatabase: AppDatabase


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Toast.makeText(context, "appDatabase.toString() = " + appDatabase.toString(), Toast.LENGTH_LONG).show()
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}