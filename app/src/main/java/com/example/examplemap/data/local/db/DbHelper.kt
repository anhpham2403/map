package com.example.examplemap.data.local.db

import androidx.lifecycle.LiveData
import com.example.examplemap.data.model.Template

interface DbHelper {

    //Template
    fun insertTemplate(template: Template)

    fun findTemplateById(id: Int): LiveData<Template>

    fun getTemplates(): LiveData<List<Template>>

}
