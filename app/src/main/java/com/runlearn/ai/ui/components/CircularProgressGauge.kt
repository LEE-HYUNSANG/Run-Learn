package com.runlearn.ai.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressGauge(progress: Float, label: String) {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        CircularProgressIndicator(progress = progress)
        Text(label)
    }
}
