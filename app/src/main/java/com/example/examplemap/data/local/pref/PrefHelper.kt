package com.example.examplemap.data.local.pref

interface PrefHelper {

    fun clear()

    fun getFirstRun(): Boolean

    fun setFirstRun(firstRun: Boolean)

}
