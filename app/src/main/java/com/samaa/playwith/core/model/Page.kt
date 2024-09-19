package com.samaa.playwith.core.model

data class Page<T>(
    val list: List<T>? = null,
    val total: Long? = 0,
    val currentPage: Long? = 0,
    val pageSize: Long? = 0
)