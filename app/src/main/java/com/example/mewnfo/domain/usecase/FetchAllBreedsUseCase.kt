package com.example.mewnfo.domain.usecase

import com.example.mewnfo.domain.model.Cat

interface FetchAllBreedsUseCase {
    suspend fun invoke(): List<Cat>
}