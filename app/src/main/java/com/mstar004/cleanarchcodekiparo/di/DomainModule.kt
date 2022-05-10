package com.mstar004.cleanarchcodekiparo.di

import com.mstar004.cleanarchcodekiparo.domain.repository.UserRepository
import com.mstar004.cleanarchcodekiparo.domain.usecases.GetUsernameUseCase
import com.mstar004.cleanarchcodekiparo.domain.usecases.SaveUserNameUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule() {

    @Provides
    fun provideGetUserNameUseCase(userRepository: UserRepository): GetUsernameUseCase {
        return GetUsernameUseCase(userRepository = userRepository)
    }
    @Provides
    fun provideSaveUserNameUseCase(userRepository: UserRepository): SaveUserNameUseCase {
        return SaveUserNameUseCase(userRepository = userRepository)
    }

}