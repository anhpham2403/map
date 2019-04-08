package com.example.examplemap.data.local.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.examplemap.data.model.Template

@Dao
interface TemplateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(template: Template)

    @Query("SELECT * FROM template WHERE id = :id")
    fun findById(id: Int): LiveData<Template>

    @Query("SELECT * FROM template")
    fun getTemplates(): LiveData<List<Template>>
}
