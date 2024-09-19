package com.samaa.playwith.feature.guide.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavGraphNavigator
import androidx.navigation.compose.composable
import com.samaa.playwith.feature.guide.GuideRoute
import com.samaa.playwith.feature.splash.SplashRoute
import com.samaa.playwith.feature.splash.navigation.SPLASH
import com.samaa.playwith.ui.navigation.myComposable

const val GUIDE = "guide"

/**
 * 跳转到这个页面
 */
fun NavController.navigateToGuide(): Unit {
    navigate(GUIDE) {
        // 设置为true, 启动多个该页面时, 不会显示多个该页面
        launchSingleTop = true
        // 关闭页面
        popUpTo(SPLASH) {
            // 包括SPLASH页面
            inclusive = true
        }
    }
}

/**
 * 配置导航
 */
fun NavGraphBuilder.guideScreen(): Unit {
    myComposable(GUIDE) {
        GuideRoute(
        )
    }
}