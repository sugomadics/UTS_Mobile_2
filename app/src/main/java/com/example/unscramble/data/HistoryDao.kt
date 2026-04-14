package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Insert
    suspend fun insertHistory(history: HistoryEntity)

    @Query("SELECT * FROM history ORDER BY id DESC")
    fun getAllHistory(): Flow<List<HistoryEntity>>
}