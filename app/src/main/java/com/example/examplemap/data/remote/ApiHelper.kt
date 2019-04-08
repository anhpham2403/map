package com.example.examplemap.data.remote

import com.example.examplemap.data.model.TemplateDownload
import io.reactivex.Single

interface ApiHelper {

    fun getTemplate(): Single<TemplateDownload>

}
