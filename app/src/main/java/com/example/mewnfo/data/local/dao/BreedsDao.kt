package com.example.mewnfo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mewnfo.data.local.Constants
import com.example.mewnfo.data.local.entity.Cat
import kotlinx.coroutines.flow.Flow

@Dao
interface BreedsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(cats: List<Cat>)

    @Query("SELECT * FROM ${Constants.CAT_TABLE_NAME}")
    fun fetchAll(): Flow<List<Cat>>
}