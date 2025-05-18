package com.example.mewnfo.data.remote.source

import retrofit2.Retrofit

interface RetrofitInstanceProvider {
    fun provide(): Retrofit
}