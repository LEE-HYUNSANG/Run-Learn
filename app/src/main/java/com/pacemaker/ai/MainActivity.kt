package com.pacemaker.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import com.pacemaker.ai.ui.navigation.AppNavGraph

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RunLearnApp()
        }
    }
}

@Composable
fun RunLearnApp() {
    val navController = rememberNavController()
    Surface(modifier = Modifier) {
        AppNavGraph(navController = navController)
    }
}
