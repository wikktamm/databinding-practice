package com.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val repo:FakeRepository) : ViewModel() {

    private val _currentName = MutableLiveData<String>()
    val currentName: LiveData<String>
        get() = _currentName

    init {
        _currentName.value = repo.getRandomName()
    }
    fun getRandomName() = repo.getRandomName()

    fun chooseRandomName(){
        _currentName.value = repo.getRandomName()
    }
}