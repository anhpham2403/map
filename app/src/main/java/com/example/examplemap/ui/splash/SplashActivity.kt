package com.example.examplemap.ui.splash

import android.os.Bundle
import android.os.Handler
import com.example.examplemap.R
import com.example.examplemap.ui.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity<SplashViewModel>() {

    companion object {
        const val COUNT_DOWN_TIME = 2000L //ms
    }

    override val viewModel by viewModel<SplashViewModel>()

    override val layoutId: Int
        get() = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startCountDown()
    }

    private fun gotoPaper() {
       // startActivity(PaperActivity.getStartIntent(this))
        finish()
    }

    private fun startCountDown() {
        Handler().postDelayed({
            gotoPaper()
        }, COUNT_DOWN_TIME)
    }
}
