package com.example.mewnfo.domain.repository

import com.example.mewnfo.domain.model.Cat

interface BreedsRepository {
    suspend fun fetchBreeds(): List<Cat>
}