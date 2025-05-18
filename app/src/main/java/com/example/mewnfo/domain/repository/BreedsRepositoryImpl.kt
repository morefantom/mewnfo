package com.example.mewnfo.domain.repository

import com.example.mewnfo.data.local.dao.BreedsDao
import com.example.mewnfo.data.remote.service.BreedsService
import com.example.mewnfo.domain.model.Cat

class BreedsRepositoryImpl(
    private val breedsService: BreedsService,
    private val breedsDao: BreedsDao,
) : BreedsRepository {
    override suspend fun fetchBreeds(): List<Cat> {
        return emptyList()
    }
}