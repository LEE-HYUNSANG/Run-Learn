package com.pacemaker.ai.ui.dashboard

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeDashboardScreen(onStartSession: () -> Unit) {
    Button(onClick = onStartSession) {
        Text("Start Session")
    }
}
