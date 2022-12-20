package com.kennethss.android.compose.ui.sign.ui.password

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun PasswordScreen(
    navigateToMain: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Success password find",
            modifier = Modifier
                .align(Alignment.Center)
        )

        LaunchedEffect(true) {
            delay(2000L)
            navigateToMain()
        }
    }
}