package com.example.examplemap.data.remote

import com.example.examplemap.data.model.TemplateDownload
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiHelperImpl: ApiHelper {

    override fun getTemplate(): Single<TemplateDownload> =
        Rx2AndroidNetworking.get(AEP_GET_TEMPLATE)
            .build()
            .getObjectSingle(TemplateDownload::class.java)
}
