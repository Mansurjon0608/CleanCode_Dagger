package com.mstar004.cleanarchcodekiparo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mstar004.cleanarchcodekiparo.domain.usecases.GetUsernameUseCase
import com.mstar004.cleanarchcodekiparo.domain.usecases.SaveUserNameUseCase

class MainViewModelFactory(
    val getUsernameUseCase: GetUsernameUseCase,
    val saveUserNameUseCase: SaveUserNameUseCase,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(getUserNameUseCase = getUsernameUseCase,
            saveUsernameUseCase = saveUserNameUseCase) as T
    }
}