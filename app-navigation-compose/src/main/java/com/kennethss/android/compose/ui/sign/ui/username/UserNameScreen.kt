package com.kennethss.android.compose.ui.sign.ui.username

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun UserNameScreen(
    username: String,
    navigateToPassword: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "UserName : $username",
        )

        Button(
            onClick = { navigateToPassword() }
        ) {
            Text(
                text = "Find Password!",
                color = Color.White
            )
        }
    }
}