package com.samaa.playwith.util

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

object DateUtil {

    fun checkTimestamp(timestamp: Long): String {
        // 获取对应时区的时间
        val dateTime = Instant.ofEpochMilli(timestamp).atZone(ZoneId.systemDefault()).toLocalDateTime()
        val today = LocalDate.now()

        // 只比较日期
        val daysBetween = ChronoUnit.DAYS.between(dateTime.toLocalDate(), today)

        return when {
            daysBetween == 0L -> DateTimeFormatter.ofPattern("HH:mm").format(dateTime) // 今天
            daysBetween == 1L -> "昨天" // 昨天
            daysBetween > 10L -> "超过10天"
            else -> "$daysBetween 天前" // 其他
        }
    }
}