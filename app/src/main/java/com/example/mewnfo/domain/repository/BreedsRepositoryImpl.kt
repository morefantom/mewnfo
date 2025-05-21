package com.example.mewnfo.domain.repository

import com.example.mewnfo.data.local.dao.BreedsDao
import com.example.mewnfo.data.remote.service.BreedsService
import com.example.mewnfo.domain.model.Cat as DomainCat
import com.example.mewnfo.data.local.entity.Cat as LocalCat
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

class BreedsRepositoryImpl(
    private val breedsService: BreedsService,
    private val breedsDao: BreedsDao,
) : BreedsRepository {
    override fun fetchBreeds(): Flow<List<DomainCat>> = flow {
        breedsDao
            .fetchAll()
            .map { localCats ->
                localCats.map { DomainCat(it) }
            }
            .collect { domainCats ->
                emit(domainCats)
            }
    }.onEach { localCats ->
        if (localCats.isEmpty()) {
            breedsService
                .getBreeds(limit = 100, page = 0)
                .first()
                .map { LocalCat(it) }
                .also { breedsDao.insertAll(it) }
        }
    }
}