package com.example.mewnfo.data.local.source

import com.example.mewnfo.data.local.dao.BreedsDao

interface LocalSource {
    fun breedsDao(): BreedsDao
}