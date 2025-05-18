package com.example.mewnfo.data.remote.source

import com.example.mewnfo.data.remote.Constants
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DefaultRetrofitInstanceProvider(
    private val converterFactory: Converter.Factory = GsonConverterFactory.create()
) : RetrofitInstanceProvider {

    override fun provide(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(converterFactory)
            .build()
    }
}