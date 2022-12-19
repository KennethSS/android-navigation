package com.kennethss.android.navigation

sealed interface AppNavigator {
    data class Setting(
        val id: Int
    ) : AppNavigator
}