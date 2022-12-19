package com.kennethss.android.compose.ui.sign.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.kennethss.android.compose.ui.main.navigation.navigateMain
import com.kennethss.android.compose.ui.sign.password.navigation.navigatePassword
import com.kennethss.android.compose.ui.sign.password.navigation.passwordScreen
import com.kennethss.android.compose.ui.sign.username.navigation.userNameScreen
import com.kennethss.android.compose.ui.sign.username.navigation.usernameNavigationRoute

fun NavGraphBuilder.signGraph(navController: NavController) {
    navigation(
        startDestination = usernameNavigationRoute,
        route = "sign"
    ) {
        userNameScreen(
            navigateToPassword = { navController.navigatePassword() }
        )
        passwordScreen(
            navigateToMain = { navController.navigateMain() }
        )
    }
}