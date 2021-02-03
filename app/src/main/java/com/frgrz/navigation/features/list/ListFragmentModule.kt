package com.frgrz.navigation.features.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.inject.annotation.FragmentScope
import com.frgrz.navigation.inject.annotation.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class ListFragmentModule {

    @Provides
    @IntoMap
    @ViewModelKey(ListFragmentViewModel::class)
    fun provideViewModelFactory(): ViewModel =
        ListFragmentViewModel()

    @Provides
    @FragmentScope
    fun provideViewModel(
        fragment: ListFragment,
        factory: ViewModelProvider.Factory
    ): ListFragmentViewModel =
        ViewModelProvider(fragment, factory)
            .get(ListFragmentViewModel::class.java)

}