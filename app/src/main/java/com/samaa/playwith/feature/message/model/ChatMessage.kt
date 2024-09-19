package com.samaa.playwith.feature.message.model

data class ChatMessage (
    val messageId: Long,
    val senderUserId: String,
    val receiverUserId: String,
    val nickname: String,
    val messageType: Int,
    val message: String,
    // 1 未发送, 2 发送中, 3 已发送, 4 未读, 5 已读
    val messageStatus: Int,
//    val createTime: Date,
//    val updateTime: Date
)