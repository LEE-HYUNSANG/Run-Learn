package com.runlearn.ai.ui.session

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FeedbackScreen(onDone: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("오늘 세션 강도는 어땠나요?")

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }) { Text("쉬웠다") }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ }) { Text("적당했다") }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ }) { Text("힘들었다") }
        }

        Button(onClick = onDone, modifier = Modifier.fillMaxWidth()) {
            Text("완료")
        }
    }
}
