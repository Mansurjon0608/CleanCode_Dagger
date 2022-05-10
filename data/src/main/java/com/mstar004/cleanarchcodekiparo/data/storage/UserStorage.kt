package com.mstar004.cleanarchcodekiparo.data.storage

interface UserStorage {

    fun save(user: User):Boolean
    fun get(): User
}