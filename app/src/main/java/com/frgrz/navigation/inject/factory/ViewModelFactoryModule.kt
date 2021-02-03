package com.frgrz.navigation.inject.factory

import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.inject.factory.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}