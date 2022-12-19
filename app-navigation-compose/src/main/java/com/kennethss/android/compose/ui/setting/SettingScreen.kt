package com.kennethss.android.compose.ui.setting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kennethss.android.compose.ui.setting.navigation.SettingNavigator

@Composable
fun SettingScreen(
    id: Int,
    navigator: SettingNavigator,
    viewModel: SettingViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Setting id:$id",
        )
        Button(
            onClick = { navigator.navigateToSign() }
        ) {
            Text(
                text = "Sign",
                color = Color.White
            )
        }
    }
}