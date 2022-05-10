package com.mstar004.cleanarchcodekiparo.di

import android.content.Context
import com.mstar004.cleanarchcodekiparo.domain.usecases.GetUsernameUseCase
import com.mstar004.cleanarchcodekiparo.domain.usecases.SaveUserNameUseCase
import com.mstar004.cleanarchcodekiparo.presentation.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideMainViewModelFactory(
        getUsernameUseCase: GetUsernameUseCase,
        saveUserNameUseCase: SaveUserNameUseCase,
    ): MainViewModelFactory {
        return MainViewModelFactory(getUsernameUseCase = getUsernameUseCase,
            saveUserNameUseCase = saveUserNameUseCase)
    }

}

