package com.mstar004.cleanarchcodekiparo.domain.repository

import com.mstar004.cleanarchcodekiparo.domain.model.SaveUserNameParam
import com.mstar004.cleanarchcodekiparo.domain.model.UserName

interface UserRepository {

    fun saveUser(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}