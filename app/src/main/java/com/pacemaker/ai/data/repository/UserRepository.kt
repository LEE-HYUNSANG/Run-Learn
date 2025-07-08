package com.pacemaker.ai.data.repository

import com.pacemaker.ai.common.model.UserProfile
import com.pacemaker.ai.data.remote.RetrofitService
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val api: RetrofitService
) {
    suspend fun fetchProfile(): UserProfile {
        // placeholder
        return UserProfile()
    }
}
