package com.mstar004.cleanarchcodekiparo.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mstar004.cleanarchcodekiparo.domain.model.SaveUserNameParam
import com.mstar004.cleanarchcodekiparo.domain.model.UserName
import com.mstar004.cleanarchcodekiparo.domain.usecases.GetUsernameUseCase
import com.mstar004.cleanarchcodekiparo.domain.usecases.SaveUserNameUseCase

class MainViewModel(
    private val getUserNameUseCase: GetUsernameUseCase,
    private val saveUsernameUseCase: SaveUserNameUseCase,
) : ViewModel() {

    private val resultMutableData = MutableLiveData<String>()
    val result: LiveData<String> = resultMutableData

    init {
        Log.e("AAA", "VM created ")
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("AAA", "onCleared: VM")
    }

    fun save(text: String) {
        val params =
            SaveUserNameParam(name = text)
        val result: Boolean = saveUsernameUseCase.execute(param = params)
        resultMutableData.value = "Save result = $result"
    }

    fun load() {
        val userName: UserName = getUserNameUseCase.execute()
        resultMutableData.value = "${userName.firstName} ${userName.lastName}"

    }
}