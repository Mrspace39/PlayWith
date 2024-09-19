package com.samaa.playwith.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samaa.playwith.core.design.component.MyNavigationBar
import com.samaa.playwith.feature.apply.navigation.applyScreen
import com.samaa.playwith.feature.guide.GuideRoute
import com.samaa.playwith.feature.guide.navigation.guideScreen
import com.samaa.playwith.feature.guide.navigation.navigateToGuide
import com.samaa.playwith.feature.main.navigation.BottomLevelNavigation
import com.samaa.playwith.feature.main.navigation.mainScreen
import com.samaa.playwith.feature.main.navigation.navigateToMain
import com.samaa.playwith.feature.me.navigation.meScreen
import com.samaa.playwith.feature.message.navigation.messageScreen
import com.samaa.playwith.feature.splash.SplashRoute
import com.samaa.playwith.feature.splash.SplashScreen
import com.samaa.playwith.feature.splash.navigation.navigateToSplash
import com.samaa.playwith.feature.splash.navigation.splashScreen

/**
 * 全局功能
 */
@Composable
fun GlobalPage() {
    val navController = rememberNavController()

//    Scaffold(
//        bottomBar = { MyNavigationBar(navController) }
//    ){}

    // 所有的页面配置
    NavHost(navController = navController, startDestination = "splash") {
        splashScreen(
            toGuide = navController::navigateToGuide,
            toMain = navController::navigateToMain
        )
        guideScreen()
        mainScreen()
        applyScreen()
        messageScreen()
        meScreen()
    }
}