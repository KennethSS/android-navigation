package com.kennethss.android.compose.ui.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.kennethss.android.compose.ui.home.HomeScreen

const val homeNavigationRoute = "home_route"

fun NavController.navigateHome(navOptions: NavOptions? = null) {
    this.navigate(homeNavigationRoute, navOptions)
}

fun NavGraphBuilder.movieScreen(
    movieNavigator: HomeNavigator,
) {
    composable(route = homeNavigationRoute) {
        HomeScreen(movieNavigator)
    }
}