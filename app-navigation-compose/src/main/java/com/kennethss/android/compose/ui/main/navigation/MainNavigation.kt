package com.kennethss.android.compose.ui.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.kennethss.android.compose.ui.main.MainRoute
import com.kennethss.android.compose.ui.my.navigation.myNavigationRoute

const val mainNavigationRoute = "main"

fun NavController.navigateMain() {
    this.navigate(mainNavigationRoute) {
        launchSingleTop = true
    }
}


fun NavGraphBuilder.mainScreen(
    mainNavigator: MainNavigator
) {
    composable(route = mainNavigationRoute) {
        MainRoute(mainNavigator)
    }
}