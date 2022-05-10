package com.mstar004.cleanarchcodekiparo.domain.usecases

import com.mstar004.cleanarchcodekiparo.domain.model.UserName
import com.mstar004.cleanarchcodekiparo.domain.repository.UserRepository

class GetUsernameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }

}