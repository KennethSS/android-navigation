package com.kennethss.android.compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.kennethss.android.compose.ui.main.navigation.mainNavigationRoute
import com.kennethss.android.compose.ui.main.navigation.mainScreen
import com.kennethss.android.compose.ui.setting.navigation.settingScreen
import com.kennethss.android.compose.ui.sign.navigation.signGraph

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = mainNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        mainScreen(AppNavigator(navController))
        settingScreen(AppNavigator(navController))
        signGraph(navController)
    }
}