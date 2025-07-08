package com.runlearn.ai.ui.onboarding

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun OnboardingScreen(onFinish: () -> Unit) {
    Button(onClick = onFinish) {
        Text("Finish Onboarding")
    }
}
