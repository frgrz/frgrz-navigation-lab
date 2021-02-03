package com.frgrz.navigation.features.list

import androidx.lifecycle.ViewModel

class ListFragmentViewModel(
    repository: ListFragmentFakeRepository,
    navigation: ListFragmentNavigation
) : ViewModel() {

    val items = repository.getItemViewModels(navigation)

}