package com.kennethss.android.compose.ui.sign.ui.password.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.kennethss.android.compose.ui.sign.ui.password.PasswordScreen

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