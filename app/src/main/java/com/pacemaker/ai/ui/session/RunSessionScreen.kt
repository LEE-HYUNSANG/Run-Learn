package com.pacemaker.ai.ui.session

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RunSessionScreen(onFinished: () -> Unit) {
    Button(onClick = onFinished) {
        Text("End Session")
    }
}
