package com.runlearn.ai.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class OnboardingViewModel : ViewModel() {
    private val _state = MutableStateFlow("")
    val state: StateFlow<String> = _state
}
