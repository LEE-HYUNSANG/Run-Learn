package com.runlearn.ai.domain.usecase

import com.runlearn.ai.common.model.UserProfile
import com.runlearn.ai.data.repository.UserRepository
import javax.inject.Inject

class GetProfileUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): UserProfile = repository.fetchProfile()
}
