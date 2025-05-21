package com.example.mewnfo.domain.usecase

import com.example.mewnfo.domain.model.Cat
import com.example.mewnfo.domain.repository.BreedsRepository
import kotlinx.coroutines.flow.Flow

class FetchAllBreedsUseCaseImpl(
    private val breedsRepository: BreedsRepository,
): FetchAllBreedsUseCase {
    override suspend fun invoke(): Flow<List<Cat>> {
        return breedsRepository.fetchBreeds()
    }
}