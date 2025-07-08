package com.runlearn.ai.ui.session

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RunSessionScreen(onFinished: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(listOf(Color.Red, Color.Transparent))
            )
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("페이스 5'30\"")
            Text("거리 3.2 km")
            Text("심박수 150")
        }

        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Pause, contentDescription = null)
                Spacer(Modifier.width(4.dp))
                Text("일시정지")
            }
            Button(onClick = onFinished) {
                Icon(Icons.Default.Stop, contentDescription = null)
                Spacer(Modifier.width(4.dp))
                Text("종료")
            }
        }
    }
}
