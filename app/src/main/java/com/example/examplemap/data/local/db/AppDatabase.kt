package com.example.examplemap.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.examplemap.data.local.db.dao.TemplateDao
import com.example.examplemap.data.model.Template

@Database(entities = [Template::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun templateDao(): TemplateDao
}
