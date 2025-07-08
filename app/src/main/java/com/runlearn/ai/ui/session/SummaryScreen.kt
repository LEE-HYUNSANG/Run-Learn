package com.runlearn.ai.ui.session

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Map
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SummaryScreen(onNext: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Default.Map, contentDescription = null)
            }
        }

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(5) { index ->
                ListItem(
                    headlineContent = { Text("랩 ${index + 1}") },
                    supportingContent = { Text("00:00") }
                )
            }
        }

        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("심박수 그래프")
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("칼로리")
                Text("평균 페이스")
                Text("VO₂max")
            }
        }

        Button(onClick = onNext, modifier = Modifier.fillMaxWidth()) {
            Text("피드백 입력")
        }
    }
}
