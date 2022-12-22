package com.kennethss.android.compose.ui.sign.ui.username.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.google.accompanist.navigation.animation.composable
import com.kennethss.android.compose.navigation.AppDestination
import com.kennethss.android.compose.ui.sign.ui.username.UserNameScreen
import com.kennethss.android.compose.ui.sign.ui.username.navigation.UserName.getDeepLinkValue

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.userNameScreen(
    navigateToPassword: () -> Unit
) {
    composable(
        route = UserName.routeArgs,
        arguments = UserName.arguments,
        deepLinks = UserName.deepLinks
    ) { backStackEntry ->
        val username = backStackEntry.getDeepLinkValue()
        UserNameScreen(
            username = username,
            navigateToPassword = navigateToPassword
        )
    }
}

object UserName : AppDestination {
    override val route: String = "username"
    private const val KEY = "username"

    val routeArgs = "$route?$KEY={$KEY}"
    val arguments = listOf(
        navArgument(KEY) {
            type = NavType.StringType
            defaultValue = ""
        }
    )
    val deepLinks = listOf(navDeepLink {
        uriPattern = "navigation_compose://$route/{$KEY}"
    })

    fun NavBackStackEntry.getDeepLinkValue() = arguments?.getString(KEY) ?: ""
}