package com.samaa.playwith.feature.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.samaa.playwith.feature.main.MainRoute
import com.samaa.playwith.ui.navigation.myComposable

const val MAIN = "main"

fun NavController.navigateToMain(): Unit {
    navigate(MAIN) {
        launchSingleTop = true
        popUpTo(MAIN)
    }
}

fun NavGraphBuilder.mainScreen(){
    myComposable(MAIN) {
        MainRoute()
    }
}