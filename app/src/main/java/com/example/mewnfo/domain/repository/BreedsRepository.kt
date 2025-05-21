package com.example.mewnfo.domain.repository

import com.example.mewnfo.domain.model.Cat
import kotlinx.coroutines.flow.Flow

interface BreedsRepository {
    fun fetchBreeds(): Flow<List<Cat>>
}