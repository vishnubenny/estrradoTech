package com.vishnu.estradotext

import android.app.Application
import com.vishnu.estradotext.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EstrradoApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@EstrradoApp)
            modules(appModule)
        }
    }
}
