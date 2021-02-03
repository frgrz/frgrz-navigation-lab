package com.frgrz.navigation.features.main.inject

import com.frgrz.navigation.features.main.MainActivity
import com.frgrz.navigation.inject.annotation.ActivityScope
import com.frgrz.navigation.inject.factory.ViewModelFactoryModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            ViewModelFactoryModule::class,
            MainActivityModule::class,
            MainActivityFragmentBuilderModule::class
        ]
    )
    abstract fun bindMainActivity(): MainActivity

}



