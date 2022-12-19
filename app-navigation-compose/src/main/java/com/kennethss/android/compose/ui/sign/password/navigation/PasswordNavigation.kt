package com.kennethss.android.compose.ui.sign.password.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.kennethss.android.compose.ui.home.navigation.homeNavigationRoute
import com.kennethss.android.compose.ui.sign.password.PasswordScreen
import com.kennethss.android.compose.ui.sign.username.UserNameScreen

const val passwordNameNavigationRoute = "password_route"

fun NavController.navigatePassword(navOptions: NavOptions? = null) {
    this.navigate(passwordNameNavigationRoute, navOptions)
}

fun NavGraphBuilder.passwordScreen(
    navigateToMain: () -> Unit
) {
    composable(route = passwordNameNavigationRoute) {
        PasswordScreen(
            navigateToMain = navigateToMain
        )
    }
}