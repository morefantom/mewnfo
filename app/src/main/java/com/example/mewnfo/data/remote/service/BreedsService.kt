package com.example.mewnfo.data.remote.service

import com.example.mewnfo.data.remote.model.Cat
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BreedsService {

    @Headers("x-api-key: live_cjZ3GEL5MzxvOoToSb8hSUogTBbTJf42mXbLJjNHNXVZveFIiY7uzrgdpp3CWNnL")
    @GET("/v1/breeds")
    fun getBreeds(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
    ): Flow<List<Cat>>
}