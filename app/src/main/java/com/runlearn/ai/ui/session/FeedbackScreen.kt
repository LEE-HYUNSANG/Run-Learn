package com.runlearn.ai.ui.feedback

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FeedbackScreen(onDone: () -> Unit) {
    Button(onClick = onDone) {
        Text("Done")
    }
}
