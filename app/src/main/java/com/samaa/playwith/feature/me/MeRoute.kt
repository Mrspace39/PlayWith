package com.samaa.playwith.feature.me

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.samaa.playwith.core.design.component.MyNavigationBar
import com.samaa.playwith.feature.main.navigation.BottomLevelNavigation

/**
 * 我的页面
 */
@Composable
fun MeRoute() {
    MeScreen()
}

@Composable
fun MeScreen() {
//    var currentDestination by remember {
//        mutableStateOf(BottomLevelNavigation.ME_BOTTOM.route)
//    }
//    Column(modifier = Modifier.fillMaxSize()) {
        MeContent(modifier = Modifier)
//        MyNavigationBar(
//            destinations = BottomLevelNavigation.entries,
//            onNavigateToDestination = {
//                currentDestination = BottomLevelNavigation.entries[it].route
//            },
//            currentDestination = BottomLevelNavigation.ME_BOTTOM.route,
//            modifier = Modifier
//        )
//    }
}

@Composable
fun MeContent(modifier: Modifier) {
    Text(text = "我的我的我的我的我的我的我的我的我的我的我的我的我的")
}

