package com.example.examplemap.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.example.examplemap.data.model.Template

data class TemplateDownload(
    @Expose
    @SerializedName("name")
    val name: String?
) {
    fun toTemplate() = Template(id = null, name = this.name)
}
