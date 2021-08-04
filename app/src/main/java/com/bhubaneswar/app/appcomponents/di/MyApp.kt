package com.bhubaneswar.app.appcomponents.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApp : Application() {

    private fun getKoinModules(): MutableList<Module> {
        val koinModules = mutableListOf<Module>()
        return koinModules
    }

    public override fun onCreate(): Unit {
        super.onCreate()
        instance = this
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            loadKoinModules(getKoinModules())
        }
    }

    public companion object {
        private lateinit var instance: MyApp

        public fun getInstance(): MyApp = instance
    }
}