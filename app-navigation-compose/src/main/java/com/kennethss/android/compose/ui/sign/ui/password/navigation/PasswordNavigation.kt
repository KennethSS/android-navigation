package com.kennethss.android.compose.ui.sign.ui.password.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.google.accompanist.navigation.animation.composable
import com.kennethss.android.compose.ui.sign.ui.password.PasswordScreen

const val passwordNameNavigationRoute = "password_route"

fun NavController.navigatePassword(navOptions: NavOptions? = null) {
    this.navigate(passwordNameNavigationRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.passwordScreen(
    navigateToMain: () -> Unit
) {
    composable(route = passwordNameNavigationRoute) {
        PasswordScreen(
            navigateToMain = navigateToMain
        )
    }
}