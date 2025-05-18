package com.example.mewnfo.data.local.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mewnfo.data.local.dao.BreedsDao
import com.example.mewnfo.data.local.entity.Cat

@Database(entities = [Cat::class], version = 1)
abstract class RoomLocalSource : RoomDatabase(), LocalSource {
    abstract override fun breedsDao(): BreedsDao
}