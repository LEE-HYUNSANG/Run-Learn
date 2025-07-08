package com.runlearn.ai.ui.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleCard(text: String) {
    Card {
        Text(text)
    }
}
