package ru.geekbrains.kotlin_1

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val viewStateLiveData : MutableLiveData<String> = MutableLiveData()

    init {
        viewStateLiveData.value = Model.LABEL
    }

    fun viewState(): LiveData<String> = viewStateLiveData


}