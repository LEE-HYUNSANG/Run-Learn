package com.runlearn.ai.ui.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OnboardingScreen(onFinish: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Run & Learn",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 32.dp)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }) { Text("감량") }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ }) { Text("지구력") }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ }) { Text("스트레스") }
        }

        Button(onClick = onFinish, modifier = Modifier.fillMaxWidth()) {
            Text("다음")
        }
    }
}
