package com.pacemaker.ai.ui.session

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SessionPreviewScreen(onStart: () -> Unit) {
    Button(onClick = onStart) {
        Text("Begin Run")
    }
}
