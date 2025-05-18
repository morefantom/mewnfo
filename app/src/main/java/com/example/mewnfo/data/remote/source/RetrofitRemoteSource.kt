package com.example.mewnfo.data.remote.source

import com.example.mewnfo.data.remote.service.BreedsService

class RetrofitRemoteSource(
    private val retrofitInstanceProvider: RetrofitInstanceProvider
) : RemoteSource {

    override fun breedsService(): BreedsService {
        return retrofitInstanceProvider
            .provide()
            .create(BreedsService::class.java)
    }
}