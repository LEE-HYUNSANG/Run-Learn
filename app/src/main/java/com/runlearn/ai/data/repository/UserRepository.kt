package com.runlearn.ai.data.repository

import com.runlearn.ai.common.model.UserProfile
import com.runlearn.ai.data.remote.RetrofitService
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val api: RetrofitService
) {
    suspend fun fetchProfile(): UserProfile {
        // placeholder
        return UserProfile()
    }
}
