package com.samaa.playwith.feature.message.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.samaa.playwith.feature.message.MessageRoute
import com.samaa.playwith.ui.navigation.myComposable

const val MESSAGE = "message"

fun NavController.navigateToMessage(): Unit {
    navigate(MESSAGE) {
        launchSingleTop = true
        popUpTo(MESSAGE)
    }
}

fun NavGraphBuilder.messageScreen(){
    myComposable(MESSAGE) {
        MessageRoute()
    }
}