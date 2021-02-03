package com.frgrz.navigation.features.main.inject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.features.main.MainActivity
import com.frgrz.navigation.features.main.MainActivityViewModel
import com.frgrz.navigation.inject.annotation.ActivityScope
import com.frgrz.navigation.inject.annotation.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class MainActivityModule{
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