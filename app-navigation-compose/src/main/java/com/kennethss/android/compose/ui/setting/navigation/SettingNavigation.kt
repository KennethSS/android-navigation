package com.kennethss.android.compose.ui.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.kennethss.android.compose.navigation.AppDestination
import com.kennethss.android.compose.ui.setting.SettingScreen

fun NavController.navigateSetting(
    id: Int,
    navOptions: NavOptions? = null
) {
    navigate("${Setting.route}/$id", navOptions)
}

fun NavGraphBuilder.settingScreen(
    navigator: SettingNavigator
) {
    composable(
        route = Setting.routeArgs,
        arguments = Setting.arguments,
        deepLinks = Setting.deepLinks
    ) { backStackEntry ->
        val id = backStackEntry.arguments?.getInt(KEY_ID) ?: 0
        SettingScreen(
            id = id,
            navigator = navigator
        )
    }
}

object Setting : AppDestination {
    override val route: String = "setting"
    val routeArgs = "$route?id={id}"
    val arguments = listOf(
        navArgument(KEY_ID) {
            type = NavType.IntType
            defaultValue = 0
        }
    )
    val deepLinks = listOf(navDeepLink {
        uriPattern = "navigation_compose://$route/{id}"
    })
}

const val KEY_ID = "id"