package com.frgrz.navigation.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.features.main.MainActivityRouter
import com.frgrz.navigation.inject.annotation.FragmentScope
import com.frgrz.navigation.inject.annotation.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class HomeFragmentModule {

    @Provides
    @IntoMap
    @ViewModelKey(HomeFragmentViewModel::class)
    fun provideViewModelFactory(
        router: MainActivityRouter
    ): ViewModel =
        HomeFragmentViewModel(router)

    @Provides
    @FragmentScope
    fun provideViewModel(
        fragment: HomeFragment,
        factory: ViewModelProvider.Factory
    ): HomeFragmentViewModel =
        ViewModelProvider(fragment, factory)
            .get(HomeFragmentViewModel::class.java)

}