package com.frgrz.navigation.features.main.inject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.R
import com.frgrz.navigation.features.main.MainActivity
import com.frgrz.navigation.features.main.MainActivityRouter
import com.frgrz.navigation.features.main.MainActivityViewModel
import com.frgrz.navigation.inject.annotation.ActivityScope
import com.frgrz.navigation.inject.annotation.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class MainActivityModule {

    @ActivityScope
    @Provides
    fun provideMainActivityRouter(activity: MainActivity): MainActivityRouter =
        MainActivityRouter(
            activity,
            R.id.homeFragment,
            R.id.main_nav_host
        )

    @Provides
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    fun provideMainActivityViewModelFactory(): ViewModel =
        MainActivityViewModel()

    @ActivityScope
    @Provides
    fun provideMainActivityViewModel(
        activity: MainActivity,
        factory: ViewModelProvider.Factory
    ): MainActivityViewModel =
        ViewModelProvider(activity, factory)
            .get(MainActivityViewModel::class.java)

}