package com.mstar004.cleanarchcodekiparo.data.repository

import com.mstar004.cleanarchcodekiparo.data.storage.User
import com.mstar004.cleanarchcodekiparo.data.storage.UserStorage
import com.mstar004.cleanarchcodekiparo.domain.model.SaveUserNameParam
import com.mstar004.cleanarchcodekiparo.domain.model.UserName
import com.mstar004.cleanarchcodekiparo.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveUser(saveParam: SaveUserNameParam): Boolean {
        val user = User(firstName = saveParam.name, lastName = "")
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }

}