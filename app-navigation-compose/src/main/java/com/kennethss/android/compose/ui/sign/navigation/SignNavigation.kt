package com.kennethss.android.compose.ui.sign.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.kennethss.android.compose.ui.main.navigation.navigateMain
import com.kennethss.android.compose.ui.sign.ui.password.navigation.navigatePassword
import com.kennethss.android.compose.ui.sign.ui.password.navigation.passwordScreen
import com.kennethss.android.compose.ui.sign.ui.username.navigation.UserName
import com.kennethss.android.compose.ui.sign.ui.username.navigation.userNameScreen

fun NavGraphBuilder.signGraph(navController: NavController) {
    navigation(
        startDestination = UserName.routeArgs,
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