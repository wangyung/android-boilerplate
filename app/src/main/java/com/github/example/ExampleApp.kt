package com.github.example

import android.app.Application
import com.github.example.module.appModule
import org.koin.android.ext.android.startKoin

class ExampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}
