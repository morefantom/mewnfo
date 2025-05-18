package com.example.mewnfo.data.local.di

import android.content.Context
import androidx.room.Room
import com.example.mewnfo.data.local.Constants
import com.example.mewnfo.data.local.dao.BreedsDao
import com.example.mewnfo.data.local.source.LocalSource
import com.example.mewnfo.data.local.source.RoomLocalSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule(
    private val applicationContext: Context,
) {

    @Provides
    fun provideApplicationContext(): Context = applicationContext

    @Provides
    fun provideRoomLocalSource(
        context: Context,
    ): RoomLocalSource {
        return Room
            .databaseBuilder(
                context,
                RoomLocalSource::class.java,
                Constants.DB_NAME,
            ).build()
    }

    @Provides
    @Singleton
    fun provideLocalSource(
        roomLocalSource: RoomLocalSource,
    ): LocalSource = roomLocalSource

    @Provides
    @Singleton
    fun provideBreedsDao(
        localSource: LocalSource,
    ): BreedsDao = localSource.breedsDao()
}