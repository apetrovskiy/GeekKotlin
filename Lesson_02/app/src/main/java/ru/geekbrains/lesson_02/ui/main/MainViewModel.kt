package ru.geekbrains.lesson_02.ui.main

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import ru.geekbrains.lesson_02.data.entity.NotesRepository

class MainViewModel : AndroidViewModel {

    private val viewStateLiveData: MutableLiveData<MainViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = MainViewState(NotesRepository.getNotes())
    }
}