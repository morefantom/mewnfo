package com.example.mewnfo.domain.usecase

import com.example.mewnfo.domain.model.Cat
import kotlinx.coroutines.flow.Flow

interface FetchAllBreedsUseCase {
    suspend fun invoke(): Flow<List<Cat>>
}