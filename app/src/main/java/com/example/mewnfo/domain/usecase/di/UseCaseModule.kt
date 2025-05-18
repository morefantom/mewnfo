package com.example.mewnfo.domain.usecase.di

import com.example.mewnfo.domain.repository.BreedsRepository
import com.example.mewnfo.domain.usecase.FetchAllBreedsUseCase
import com.example.mewnfo.domain.usecase.FetchAllBreedsUseCaseImpl
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideFetchAllBreedsUseCase(
        breedsRepository: BreedsRepository,
    ): FetchAllBreedsUseCase {
        return FetchAllBreedsUseCaseImpl(
            breedsRepository = breedsRepository,
        )
    }
}