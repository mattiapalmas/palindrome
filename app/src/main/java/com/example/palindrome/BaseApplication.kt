package com.example.palindrome

import android.app.Application
import com.example.palindrome.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(listOf(viewModelModule))
        }
    }
}