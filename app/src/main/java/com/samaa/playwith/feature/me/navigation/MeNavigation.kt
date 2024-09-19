package com.samaa.playwith.feature.me.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.samaa.playwith.feature.me.MeRoute
import com.samaa.playwith.ui.navigation.myComposable

const val ME = "me"

fun NavController.navigateToMe(): Unit {
    navigate(ME) {
        launchSingleTop = true
        popUpTo(ME)
    }
}

fun NavGraphBuilder.meScreen(){
    myComposable(ME) {
        MeRoute()
    }
}