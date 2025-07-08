package com.pacemaker.ai.domain.usecase

import com.pacemaker.ai.common.model.UserProfile
import com.pacemaker.ai.data.repository.UserRepository
import javax.inject.Inject

class GetProfileUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): UserProfile = repository.fetchProfile()
}
