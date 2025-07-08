package com.pacemaker.ai.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel : ViewModel() {
    private val _sessions = MutableStateFlow(0)
    val sessions: StateFlow<Int> = _sessions
}
