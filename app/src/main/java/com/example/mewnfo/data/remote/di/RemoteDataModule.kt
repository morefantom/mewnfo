package com.example.mewnfo.data.remote.di

import com.example.mewnfo.data.remote.service.BreedsService
import com.example.mewnfo.data.remote.source.DefaultRetrofitInstanceProvider
import com.example.mewnfo.data.remote.source.RemoteSource
import com.example.mewnfo.data.remote.source.RetrofitInstanceProvider
import com.example.mewnfo.data.remote.source.RetrofitRemoteSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {

    @Provides
    fun provideRetrofitInstanceProvider(): RetrofitInstanceProvider {
        return DefaultRetrofitInstanceProvider()
    }

    @Provides
    @Singleton
    fun provideRemoteSource(
        retrofitInstanceProvider: RetrofitInstanceProvider
    ): RemoteSource {
        return RetrofitRemoteSource(
            retrofitInstanceProvider = retrofitInstanceProvider
        )
    }

    @Provides
    @Singleton
    fun provideBreedsService(
        remoteSource: RemoteSource
    ): BreedsService {
        return remoteSource.breedsService()
    }
}