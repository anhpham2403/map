package com.example.examplemap.data.local.pref

import android.content.Context

class PrefHelperImpl(context: Context) : PrefHelper {

    companion object {
        private const val FIRST_RUN = "FIRST_RUN"
    }

    private val sharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    override fun clear() {
        sharedPreferences.edit().clear().apply()
    }

    override fun getFirstRun(): Boolean = sharedPreferences.getBoolean(FIRST_RUN, false)

    override fun setFirstRun(firstRun: Boolean) {
        sharedPreferences.edit().putBoolean(FIRST_RUN, firstRun).apply()
    }

}
