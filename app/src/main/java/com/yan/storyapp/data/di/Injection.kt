package com.yan.storyapp.data.di

import android.content.Context
import com.yan.storyapp.data.api.ApiConfig
import com.yan.storyapp.data.preference.UserPreference
import com.yan.storyapp.data.preference.dataStore
import com.yan.storyapp.data.repository.StoryRepository

object Injection {
    fun provideRepository(context: Context): StoryRepository {
        val apiService = ApiConfig.getApiService()
        val pref = UserPreference.getInstance(context.dataStore)
        return StoryRepository.getInstance(apiService, pref)
    }
}
