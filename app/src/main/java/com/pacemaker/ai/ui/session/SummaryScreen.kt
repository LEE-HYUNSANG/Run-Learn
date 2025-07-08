package com.pacemaker.ai.ui.session

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SummaryScreen(onNext: () -> Unit) {
    Button(onClick = onNext) {
        Text("Next")
    }
}
