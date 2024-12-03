package com.uilover.project2112.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.uilover.project2112.Model.DoctorsModel
import com.uilover.project2112.Repository.MainRepository

class MainViewModel() : ViewModel() {

    private val repository = MainRepository()

    fun loadDoctors(): LiveData<MutableList<DoctorsModel>> {
        return repository.load()
    }
}