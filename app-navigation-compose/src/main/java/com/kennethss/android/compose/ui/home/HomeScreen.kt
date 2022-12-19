package com.kennethss.android.compose.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kennethss.android.compose.ui.home.navigation.HomeNavigator

@Composable
fun HomeScreen(homeNavigator: HomeNavigator) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home",
        )
        Button(
            onClick = { homeNavigator.navigateSetting(1) }
        ) {
            Text(
                text = "Setting",
                color = Color.White
            )
        }
    }
}