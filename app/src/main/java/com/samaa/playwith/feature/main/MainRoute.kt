package com.samaa.playwith.feature.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.samaa.playwith.core.design.component.MyNavigationBar
import com.samaa.playwith.feature.guide.GuideRoute
import com.samaa.playwith.feature.main.navigation.BottomLevelNavigation
import com.samaa.playwith.feature.main.navigation.MAIN
import com.samaa.playwith.feature.me.MeRoute
import com.samaa.playwith.feature.message.MessageRoute
import kotlinx.coroutines.launch

/**
 * 首页
 */
@Composable
fun MainRoute() {
    MainScreen()
}

@Composable
fun MainScreen() {
    var currentDestination by rememberSaveable {
        mutableStateOf(BottomLevelNavigation.GUIDE_BOTTOM.route)
    }

    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {
        // 主内容
        val pagerState = rememberPagerState {
            BottomLevelNavigation.entries.size
        }

        HorizontalPager(
            state = pagerState,
            // 不允许左右滑动
            userScrollEnabled = false,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) { page ->
            when (page) {
                0 -> GuideRoute()
                1 -> MessageRoute()
                2 -> MeRoute()
            }

        }

        // 底部导航栏
        MyNavigationBar(
            destinations = BottomLevelNavigation.entries,
            onNavigateToDestination = {
                currentDestination = BottomLevelNavigation.entries[it].route
                scope.launch {
                    // 内容滚动到指定页面
                    pagerState.scrollToPage(it)
                }
            },
            currentDestination = currentDestination,
            modifier = Modifier
        )
    }
}

@Composable
fun MainContent(modifier: Modifier) {

}

