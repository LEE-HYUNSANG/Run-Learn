package com.pacemaker.ai.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SessionViewModel : ViewModel() {
    private val _running = MutableStateFlow(false)
    val running: StateFlow<Boolean> = _running
}
