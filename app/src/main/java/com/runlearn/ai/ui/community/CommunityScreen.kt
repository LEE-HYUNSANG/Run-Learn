package com.runlearn.ai.ui.community

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CommunityScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("챌린지", "피드")

    Column(modifier = Modifier.fillMaxSize()) {
        TabRow(selectedTabIndex = selectedTab) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    text = { Text(title) }
                )
            }
        }

        when (selectedTab) {
            0 -> LazyColumn(modifier = Modifier.padding(16.dp)) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Text("챌린지 $index", modifier = Modifier.padding(16.dp))
                    }
                }
            }

            1 -> LazyColumn(modifier = Modifier.padding(16.dp)) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Text("피드 $index", modifier = Modifier.padding(16.dp))
                    }
                }
            }
        }
    }
}
