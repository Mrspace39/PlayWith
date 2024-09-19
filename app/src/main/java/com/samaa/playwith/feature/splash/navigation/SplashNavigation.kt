package com.samaa.playwith.feature.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavGraphNavigator
import androidx.navigation.compose.composable
import com.samaa.playwith.feature.splash.SplashRoute
import com.samaa.playwith.ui.navigation.myComposable

const val SPLASH = "splash"

/**
 * 跳转到这个页面
 */
fun NavController.navigateToSplash(): Unit{
    navigate(SPLASH)
}

/**
 * 配置导航
 */
fun NavGraphBuilder.splashScreen(toGuide: () -> Unit, toMain: () -> Unit):Unit {
    myComposable(SPLASH) {
        SplashRoute(
            toGuide = toGuide,
            toMain = toMain
        )
    }
}