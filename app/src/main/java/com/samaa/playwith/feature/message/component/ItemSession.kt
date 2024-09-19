package com.samaa.playwith.feature.message.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samaa.playwith.R
import com.samaa.playwith.feature.message.model.ChatSession
import com.samaa.playwith.util.DateUtil.checkTimestamp

/**
 * UI
 *
 * 消息Item
 */
@Composable
fun ItemSession(
    data: ChatSession, modifier: Modifier = Modifier
): Unit {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0xffFAFAFA))
            .padding(top = 20.dp, bottom = 20.dp, start = 10.dp, end = 10.dp)
    ) {
        if (data.isUpdateAvatar) {
            Image(
                // TODO
                painter = painterResource(id = R.mipmap.avatar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
            )
        } else {
            // 使用本地缓存头像
        }

        Column(
            modifier = Modifier
                .weight(2f)
                .padding(10.dp)
        ) {
            Text(
                text = data.nickname,
                minLines = 2,
                maxLines = 3,
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = data.lastMessage ?: " ",
                minLines = 1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.Gray
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
        ) {
            // 校验时间戳, 转换为时间文本
            Text(text = checkTimestamp(data.lastSendTime))

            // 未读消息数字
            if (data.unreadCount > 0) {
                Box(
                    modifier = Modifier
                        .padding(top = 25.dp, start = 40.dp)
                        .size(24.dp)
                        .background(Color(0xffFF4649), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = data.unreadCount.toString(),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
            }
        }

    }
}
