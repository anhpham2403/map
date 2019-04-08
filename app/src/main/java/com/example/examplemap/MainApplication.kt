package com.example.examplemap

import android.app.Application
import com.example.examplemap.di.modules
import org.koin.android.ext.android.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, modules)
    }
}
