package com.myapp.injection

import com.myapp.ui.MyActivity
import com.myapp.ui.MyFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppBinder {

    @ContributesAndroidInjector
    abstract fun myActivity(): MyActivity

    @ContributesAndroidInjector
    abstract fun myFragment(): MyFragment
}