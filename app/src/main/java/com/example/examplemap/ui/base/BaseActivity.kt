package com.example.examplemap.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<VM: BaseViewModel?>: AppCompatActivity() {

    companion object {
        val TAG = this::class.java.simpleName!!
    }

    @get:LayoutRes abstract val layoutId: Int

    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel?.onViewDestroyed()
    }
}
