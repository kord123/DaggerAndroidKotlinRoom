package com.myapp.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class MyActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, MyFragment())
                .commit()
    }

}
