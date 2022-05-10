package com.mstar004.cleanarchcodekiparo.domain.usecases

import com.mstar004.cleanarchcodekiparo.domain.model.SaveUserNameParam
import com.mstar004.cleanarchcodekiparo.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        return userRepository.saveUser(saveParam = param)
    }

}


