package com.kennethss.android.compose.ui.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.kennethss.android.compose.ui.home.navigation.homeNavigationRoute
import com.kennethss.android.compose.ui.home.navigation.movieScreen
import com.kennethss.android.compose.ui.my.navigation.myScreen

@Composable
fun MainNavHost(
    navController: NavHostController,
    onBackClick: () -> Unit,
    mainNavigator: MainNavigator,
    modifier: Modifier = Modifier,
    startDestination: String = homeNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        movieScreen(mainNavigator)
        myScreen()
    }
}