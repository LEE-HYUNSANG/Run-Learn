package com.runlearn.ai.di

import com.runlearn.ai.data.remote.RetrofitService
import com.runlearn.ai.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(service: RetrofitService): UserRepository =
        UserRepository(service)
}
