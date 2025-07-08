package com.runlearn.ai.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RunningSessionDao {
    @Insert
    suspend fun insert(session: RunningSessionEntity)

    @Query("SELECT * FROM running_sessions")
    suspend fun getAll(): List<RunningSessionEntity>
}
