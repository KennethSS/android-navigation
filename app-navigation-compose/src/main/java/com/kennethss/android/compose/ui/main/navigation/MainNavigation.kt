package com.kennethss.android.compose.ui.main.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.kennethss.android.compose.ui.main.MainRoute

const val mainNavigationRoute = "main"

fun NavController.navigateMain() {
    this.navigate(mainNavigationRoute) {
        launchSingleTop = true
    }
}


@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.mainScreen(
    mainNavigator: MainNavigator
) {
    composable(route = mainNavigationRoute) {
        MainRoute(mainNavigator)
    }
}