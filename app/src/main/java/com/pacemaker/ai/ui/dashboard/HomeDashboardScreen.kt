package com.pacemaker.ai.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pacemaker.ai.ui.components.AppTopBar
import com.pacemaker.ai.ui.components.CircularProgressGauge

@Composable
fun HomeDashboardScreen(onStartSession: () -> Unit) {
    Scaffold(
        topBar = { AppTopBar(title = "Dashboard", onMenuClick = {}) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("오늘 세션")
                    Spacer(Modifier.height(8.dp))
                    Button(onClick = onStartSession) {
                        Icon(Icons.Default.PlayArrow, contentDescription = null)
                        Spacer(Modifier.width(4.dp))
                        Text("시작")
                    }
                }
            }

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("KPI")
                    Spacer(Modifier.height(8.dp))
                    CircularProgressGauge(progress = 0.5f, label = "체중 감량")
                    Spacer(Modifier.height(8.dp))
                    Text("VO₂max")
                    Text("주간 목표 달성률")
                }
            }

            Text("챌린지")
            LazyRow {
                items((1..3).toList()) { index ->
                    Card(
                        modifier = Modifier
                            .size(width = 180.dp, height = 100.dp)
                            .padding(end = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("배너 $index")
                        }
                    }
                }
            }
        }
    }
}
