package com.fconline.user.di

import com.fconline.user.data.source.remote.ApiService
import com.fconline.user.data.repository.UserIdRepositoryImpl
import com.fconline.user.domain.repository.UserIdRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesUserIdRepository(
        apiService: ApiService
    ): UserIdRepository = UserIdRepositoryImpl(apiService)
}