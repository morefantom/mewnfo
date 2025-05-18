package com.example.mewnfo.presentation.component

import android.app.Application
import com.example.mewnfo.data.local.di.LocalDataModule
import com.example.mewnfo.presentation.component.di.ApplicationComponent
import com.example.mewnfo.presentation.component.di.DaggerApplicationComponent

class MewnfoApp: Application() {

    lateinit var appComponent: ApplicationComponent
        private set

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.builder()
            .localDataModule(LocalDataModule(applicationContext))
            .build()
    }
}