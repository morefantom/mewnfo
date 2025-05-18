package com.example.mewnfo.presentation.viewmodel.breeds

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class BreedsViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(
        factory: BreedsViewModelFactory
    ): ViewModelProvider.Factory
}