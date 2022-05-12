package com.mstar004.cleanarchcodekiparo.di

import com.mstar004.cleanarchcodekiparo.presentation.MainActivity
import dagger.Component


@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])

interface AppComponent {
    fun inject(mainActivity: MainActivity)
}