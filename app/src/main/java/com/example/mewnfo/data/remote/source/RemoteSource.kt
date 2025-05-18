package com.example.mewnfo.data.remote.source

import com.example.mewnfo.data.remote.service.BreedsService

interface RemoteSource {
    fun breedsService(): BreedsService
}