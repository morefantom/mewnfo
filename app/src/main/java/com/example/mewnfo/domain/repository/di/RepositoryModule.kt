package com.example.mewnfo.domain.repository.di

import com.example.mewnfo.data.local.dao.BreedsDao
import com.example.mewnfo.data.local.source.LocalSource
import com.example.mewnfo.data.remote.service.BreedsService
import com.example.mewnfo.data.remote.source.RemoteSource
import com.example.mewnfo.domain.repository.BreedsRepository
import com.example.mewnfo.domain.repository.BreedsRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideBreedsRepository(
        breedsService: BreedsService,
        breedsDao: BreedsDao,
    ): BreedsRepository {
        return BreedsRepositoryImpl(
            breedsService = breedsService,
            breedsDao = breedsDao,
        )
    }
}