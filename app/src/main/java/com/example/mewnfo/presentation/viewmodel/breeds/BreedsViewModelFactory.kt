package com.example.mewnfo.presentation.viewmodel.breeds

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mewnfo.domain.usecase.FetchAllBreedsUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreedsViewModelFactory @Inject constructor(
    private val fetchAllBreedsUseCase: FetchAllBreedsUseCase,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BreedsViewModel::class.java)) {
            return super.create(modelClass)
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}