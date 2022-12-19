package com.kennethss.android.compose.ui.sign.username.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kennethss.android.compose.ui.sign.username.UserNameScreen

const val usernameNavigationRoute = "username_route"

fun NavGraphBuilder.userNameScreen(
    navigateToPassword: () -> Unit
) {
    composable(route = usernameNavigationRoute) {
        UserNameScreen(
            navigateToPassword = navigateToPassword
        )
    }
}