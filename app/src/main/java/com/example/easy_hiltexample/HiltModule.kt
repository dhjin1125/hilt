package com.example.easy_hiltexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object HiltModule {

    @Provides
    @ViewModelScoped
    fun provideTestRepository(): TestRepository {
        return TestRepositoryImpl()
    }
}