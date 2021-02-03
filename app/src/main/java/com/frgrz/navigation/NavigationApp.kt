package com.frgrz.navigation

import android.app.Application

class NavigationApp: Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()

        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
        }

        appComponent?.inject(this)
    }

    companion object {
        var appComponent: AppComponent? = null
    }
}