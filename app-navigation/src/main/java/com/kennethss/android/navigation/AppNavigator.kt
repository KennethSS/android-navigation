package com.kennethss.android.navigation

import androidx.navigation.fragment.FragmentNavigator

sealed interface AppNavigator {
    data class Setting(
        val id: Int
    ) : AppNavigator

    data class SettingWithSharedElementTransition(
        val id: Int,
        val extras: FragmentNavigator.Extras
    ) : AppNavigator
}