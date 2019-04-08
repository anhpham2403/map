package com.example.examplemap.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel: ViewModel() {

    val isLoading = MutableLiveData<Boolean>().apply { value = false }
    val disposable = CompositeDisposable()

    fun onViewDestroyed() {
        disposable.clear()
    }
}
