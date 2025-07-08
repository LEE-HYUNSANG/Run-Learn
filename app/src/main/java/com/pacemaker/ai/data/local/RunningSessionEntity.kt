package com.pacemaker.ai.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_sessions")
data class RunningSessionEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val startTime: Long = 0,
    val durationMinutes: Int = 0
)
