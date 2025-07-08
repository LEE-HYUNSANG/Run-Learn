package com.pacemaker.ai.common.model

import java.time.LocalDateTime

data class RunningSession(
    val id: Long = 0,
    val startTime: LocalDateTime = LocalDateTime.now(),
    val durationMinutes: Int = 0,
    val distanceMeters: Float = 0f
)
