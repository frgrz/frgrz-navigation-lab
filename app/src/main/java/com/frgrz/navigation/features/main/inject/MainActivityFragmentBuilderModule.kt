package com.frgrz.navigation.features.main.inject

import com.frgrz.navigation.features.home.HomeFragment
import com.frgrz.navigation.features.home.HomeFragmentModule
import com.frgrz.navigation.features.list.ListFragment
import com.frgrz.navigation.features.list.ListFragmentModule
import com.frgrz.navigation.inject.annotation.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityFragmentBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindHomeFragment(): HomeFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [ListFragmentModule::class])
    abstract fun bindListFragment(): ListFragment
    
}