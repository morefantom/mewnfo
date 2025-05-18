package com.example.mewnfo.presentation.viewmodel.breeds

import androidx.lifecycle.ViewModel
import com.example.mewnfo.domain.usecase.FetchAllBreedsUseCase
import javax.inject.Inject

class BreedsViewModel @Inject constructor(
    private val fetchAllBreedsUseCase: FetchAllBreedsUseCase,
): ViewModel() {

    fun fetchAllBreeds(): List<String> {
        return listOf(
            "Abyssinian",
            "American Curl",
            "American Bobtail",
            "American Shorthair",
            "American Wirehair",
            "Balinese",
            "Bengal",
            "Birman",
            "Bombay",
            "British Shorthair",
            "Burmese",
            "Burmilla",
            "Chartreux",
        )
    }

}