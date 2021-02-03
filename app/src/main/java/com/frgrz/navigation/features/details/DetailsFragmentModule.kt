package com.frgrz.navigation.features.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.frgrz.navigation.datasource.FruitsFakeDataSource
import com.frgrz.navigation.inject.annotation.FragmentScope
import com.frgrz.navigation.inject.annotation.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class DetailsFragmentModule {

    @Provides
    fun provideRepository(
        dataSource: FruitsFakeDataSource
    ): DetailsFragmentFakeRepository =
        DetailsFragmentFakeRepository(dataSource)

    @Provides
    @IntoMap
    @ViewModelKey(DetailsFragmentViewModel::class)
    fun provideViewModelFactory(
        repository: DetailsFragmentFakeRepository
    ): ViewModel =
        DetailsFragmentViewModel(repository)

    @Provides
    @FragmentScope
    fun provideViewModel(
        fragment: DetailsFragment,
        factory: ViewModelProvider.Factory
    ): DetailsFragmentViewModel =
        ViewModelProvider(fragment, factory)
            .get(DetailsFragmentViewModel::class.java)

}