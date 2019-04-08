package com.example.examplemap.di

import android.content.Context
import androidx.room.Room
import com.example.examplemap.data.local.db.AppDatabase
import com.example.examplemap.data.local.db.DbHelper
import com.example.examplemap.data.local.db.DbHelperImpl
import com.example.examplemap.data.local.pref.PrefHelper
import com.example.examplemap.data.local.pref.PrefHelperImpl
import com.example.examplemap.data.remote.ApiHelper
import com.example.examplemap.data.remote.ApiHelperImpl
import com.example.examplemap.util.DB_NAME
import org.koin.dsl.module.module

val dataModule = module(override = true) {
    single { createAppDatabase(DB_NAME, get()) }
    single<PrefHelper> { PrefHelperImpl(get()) }
    single<DbHelper> { DbHelperImpl(get()) }
    single<ApiHelper> { ApiHelperImpl() }
}

fun createAppDatabase(name: String, context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, name).build()
