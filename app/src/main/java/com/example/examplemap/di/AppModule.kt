package com.example.examplemap.di

import android.content.res.Resources
import com.example.examplemap.MainApplication
import com.example.examplemap.rx.AppSchedulerProvider
import com.example.examplemap.rx.SchedulerProvider
import com.example.examplemap.ui.splash.SplashViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

//Application modules
val appModule = module(override = true) {
    single { createResource(get()) }
    single<SchedulerProvider> { AppSchedulerProvider() }
}

fun createResource(application: MainApplication): Resources = application.resources

//ViewModel Modules
val viewModelModule = module(override = true) {

    viewModel { SplashViewModel() }
}

//modules
val modules = listOf(
    appModule,
    viewModelModule,
    dataModule
)
