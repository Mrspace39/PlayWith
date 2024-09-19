package com.samaa.playwith.feature.message.model

data class ChatSession (

    val sessionId: Long,
    val receiverUserId: String,
    /**
     * 头像
     */
    val avatar: String,
    /**
     * 头像是否更新, 如果没有更新则使用缓存的, 没有缓存或更新则使用avatar
     */
    val isUpdateAvatar: Boolean,
    val nickname: String,
    val lastMessage: String,
    val lastSendTime: Long,
    val unreadCount: Int
)