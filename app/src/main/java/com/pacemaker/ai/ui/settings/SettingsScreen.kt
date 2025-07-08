package com.pacemaker.ai.ui.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text("프로필 정보: 이름, 체중")

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("목표 수정", modifier = Modifier.weight(1f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Edit, contentDescription = null)
            }
        }

        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("HealthConnect", modifier = Modifier.weight(1f))
                Switch(checked = false, onCheckedChange = { })
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("GPS", modifier = Modifier.weight(1f))
                Switch(checked = false, onCheckedChange = { })
            }
        }
    }
}
