package com.frgrz.navigation.inject

import android.app.Application
import com.frgrz.navigation.NavigationApp
import com.frgrz.navigation.features.main.inject.MainActivityBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        MainActivityBuilderModule::class
    ]
)
interface AppComponent : AndroidInjector<NavigationApp> {

    override fun inject(instance: NavigationApp?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}
