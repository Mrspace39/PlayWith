package com.samaa.playwith.feature.apply.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.samaa.playwith.feature.apply.ApplyRoute
import com.samaa.playwith.feature.main.MainRoute
import com.samaa.playwith.feature.main.navigation.MAIN
import com.samaa.playwith.ui.navigation.myComposable

const val APPLY = "apply"

fun NavController.navigateToApply(){
    navigate(APPLY){
        launchSingleTop = true

    }
}

fun NavGraphBuilder.applyScreen(){
    myComposable(APPLY) {
        ApplyRoute()
    }
}