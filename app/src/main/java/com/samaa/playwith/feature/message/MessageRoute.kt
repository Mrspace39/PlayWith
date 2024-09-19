package com.samaa.playwith.feature.message

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.samaa.playwith.feature.message.component.ItemSession
import com.samaa.playwith.feature.message.data.PreviewParameterData

/**
 * 消息页面
 */
@Composable
fun MessageRoute() {
    MessageScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageScreen() {
//    MessageContent(modifier = Modifier)

    Scaffold(
        // 头部
        topBar = {
            TopAppBar(
                title = { Text(text = "消息") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White // 设置背景颜色
                ),
                // 头部和主体部分的分割线
                modifier = Modifier.background(Color(0xffE6EFF9)).padding(bottom = 10.dp)
            )

        },
        modifier = Modifier.background(Color(0xffE6EFF9))
    ) { paddingValues ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(1.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
                .background(Color(0xffE6EFF9))
        ) {
            items(PreviewParameterData.sessionList) {
                ItemSession(
                    data = it,
                )
            }
        }
    }
}

@Composable
fun MessageContent(modifier: Modifier) {
}

