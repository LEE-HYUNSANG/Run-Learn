package com.runlearn.ai.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavBar(current: Screen, onNavigate: (Screen) -> Unit) {
    NavigationBar {
        NavItem(Screen.Dashboard, Icons.Default.Home, current, onNavigate)
        NavItem(Screen.SessionPreview, Icons.Default.DirectionsRun, current, onNavigate)
        NavItem(Screen.Community, Icons.Default.Groups, current, onNavigate)
        NavItem(Screen.Settings, Icons.Default.Settings, current, onNavigate)
    }
}

@Composable
private fun NavItem(
    screen: Screen,
    icon: ImageVector,
    current: Screen,
    onNavigate: (Screen) -> Unit
) {
    NavigationBarItem(
        selected = current == screen,
        onClick = { onNavigate(screen) },
        icon = { Icon(icon, contentDescription = screen.route) },
        label = { Text(screen.route) }
    )
}
