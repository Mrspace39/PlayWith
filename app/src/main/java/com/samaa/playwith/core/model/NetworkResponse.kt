package com.samaa.playwith.core.model

data class NetworkResponse<T>(
    /**
     * 状态码
     * 200表示成功
     */
    val status: Int = 200,

    val message: String? = null,

    val data: T? = null
)