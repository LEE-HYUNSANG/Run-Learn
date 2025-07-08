package com.pacemaker.ai.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pacemaker.ai.ui.community.CommunityScreen
import com.pacemaker.ai.ui.dashboard.HomeDashboardScreen
import com.pacemaker.ai.ui.onboarding.OnboardingScreen
import com.pacemaker.ai.ui.session.FeedbackScreen
import com.pacemaker.ai.ui.session.RunSessionScreen
import com.pacemaker.ai.ui.session.SessionPreviewScreen
import com.pacemaker.ai.ui.session.SummaryScreen
import com.pacemaker.ai.ui.settings.SettingsScreen

sealed class Screen(val route: String) {
    data object Onboarding : Screen("onboarding")
    data object Dashboard : Screen("dashboard")
    data object SessionPreview : Screen("session_preview")
    data object RunSession : Screen("run_session")
    data object Summary : Screen("summary")
    data object Feedback : Screen("feedback")
    data object Community : Screen("community")
    data object Settings : Screen("settings")
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Onboarding.route) {
        composable(Screen.Onboarding.route) {
            OnboardingScreen(onFinish = { navController.navigate(Screen.Dashboard.route) })
        }
        composable(Screen.Dashboard.route) {
            HomeDashboardScreen(onStartSession = {
                navController.navigate(Screen.SessionPreview.route)
            })
        }
        composable(Screen.SessionPreview.route) {
            SessionPreviewScreen(onStart = {
                navController.navigate(Screen.RunSession.route)
            })
        }
        composable(Screen.RunSession.route) {
            RunSessionScreen(onFinished = { navController.navigate(Screen.Summary.route) })
        }
        composable(Screen.Summary.route) {
            SummaryScreen(onNext = { navController.navigate(Screen.Feedback.route) })
        }
        composable(Screen.Feedback.route) {
            FeedbackScreen(onDone = { navController.navigate(Screen.Dashboard.route) })
        }
        composable(Screen.Community.route) {
            CommunityScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}
