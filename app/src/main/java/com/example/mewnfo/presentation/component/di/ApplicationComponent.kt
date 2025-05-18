package com.example.mewnfo.presentation.component.di

import com.example.mewnfo.data.local.di.LocalDataModule
import com.example.mewnfo.data.remote.di.RemoteDataModule
import com.example.mewnfo.domain.repository.di.RepositoryModule
import com.example.mewnfo.domain.usecase.di.UseCaseModule
import com.example.mewnfo.presentation.component.MainActivity
import com.example.mewnfo.presentation.viewmodel.breeds.BreedsViewModelFactoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        LocalDataModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        BreedsViewModelFactoryModule::class,
    ])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}