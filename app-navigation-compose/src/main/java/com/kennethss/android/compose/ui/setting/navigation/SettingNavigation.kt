package com.kennethss.android.compose.ui.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.kennethss.android.compose.ui.setting.SettingScreen

const val settingNavigationRoute = "setting_route"

fun NavController.navigateSetting(
    id: Int,
    navOptions: NavOptions? = null
) {
    this.navigate("$settingNavigationRoute/$id", navOptions)
}

fun NavGraphBuilder.settingScreen(
    navigator: SettingNavigator
) {
    composable(
        route = "$settingNavigationRoute/{id}",
        arguments = listOf(navArgument(KEY_ID) { type = NavType.IntType })
    ) { backStackEntry ->
        SettingScreen(
            id = backStackEntry.arguments?.getInt(KEY_ID) ?: 0,
            navigator = navigator
        )
    }
}

const val KEY_ID = "id"