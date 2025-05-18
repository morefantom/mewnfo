package com.example.mewnfo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mewnfo.data.local.Constants
import com.example.mewnfo.data.local.entity.Cat

@Dao
interface BreedsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cats: List<Cat>)

    @Query("SELECT * FROM ${Constants.CAT_TABLE_NAME}")
    suspend fun fetchAll(): List<Cat>
}