package com.runlearn.ai.common.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DateUtil {
    private val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    fun format(date: LocalDateTime): String = formatter.format(date)
}
