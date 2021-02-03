package com.frgrz.navigation.features.home

import androidx.lifecycle.ViewModel

class HomeFragmentViewModel(
    private val navigation: HomeNavigation
) : ViewModel() {

    fun navigateToList() {
        navigation.navigateToListFragment()
    }
}