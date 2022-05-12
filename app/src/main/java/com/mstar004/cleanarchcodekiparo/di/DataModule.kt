package com.mstar004.cleanarchcodekiparo.di

import android.content.Context
import com.mstar004.cleanarchcodekiparo.data.repository.UserRepositoryImpl
import com.mstar004.cleanarchcodekiparo.data.storage.SharedPreference
import com.mstar004.cleanarchcodekiparo.data.storage.UserStorage
import com.mstar004.cleanarchcodekiparo.domain.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideUserStorage(context: Context): UserStorage {
        return SharedPreference(context = context)
    }

    @Provides
    fun provideUserRepository(userStorage: UserStorage): UserRepository {
        return UserRepositoryImpl(userStorage = userStorage)

    }

}