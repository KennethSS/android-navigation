package com.kennethss.android.compose.ui.main.navigation

import androidx.annotation.DrawableRes
import com.kennethss.android.compose.R

enum class MainDestination(
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
    val iconTextId: String
) {
    HOME(
        selectedIcon = R.drawable.bottom_nav_home_selected,
        unselectedIcon = R.drawable.bottom_nav_home_unselected,
        iconTextId = "Home"
    ),
    MY(
        selectedIcon = R.drawable.bottom_nav_my_selected,
        unselectedIcon = R.drawable.bottom_nav_my_unselected,
        iconTextId = "MY"
    )
}