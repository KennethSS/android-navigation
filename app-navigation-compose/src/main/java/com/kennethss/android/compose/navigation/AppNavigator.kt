package com.kennethss.android.compose.navigation

import androidx.navigation.NavController
import com.kennethss.android.compose.ui.main.navigation.MainNavigator
import com.kennethss.android.compose.ui.setting.navigation.SettingNavigator
import com.kennethss.android.compose.ui.setting.navigation.navigateSetting

class AppNavigator(
    private val navController: NavController
) : MainNavigator, SettingNavigator {
    override fun navigateSetting(id: Int) {
        navController.navigateSetting(id)
    }

    override fun navigateToSign() {
        navController.navigate("sign")
    }
}