package com.example.examplemap.data.local.db

import com.example.examplemap.data.model.Template
import com.example.examplemap.util.runOnIoThread

class DbHelperImpl(
    private val appDatabase: AppDatabase
) : DbHelper {

    override fun getTemplates() = appDatabase.templateDao().getTemplates()

    override fun insertTemplate(template: Template) {
        runOnIoThread { appDatabase.templateDao().insert(template) }
    }

    override fun findTemplateById(id: Int) = appDatabase.templateDao().findById(id)

}
