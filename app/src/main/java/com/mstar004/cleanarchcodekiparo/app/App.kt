package com.mstar004.cleanarchcodekiparo.app

import android.app.Application
import com.mstar004.cleanarchcodekiparo.di.AppComponent
import com.mstar004.cleanarchcodekiparo.di.AppModule
import com.mstar004.cleanarchcodekiparo.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()

    }
}