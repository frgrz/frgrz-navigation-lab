package com.frgrz.navigation.features.list

import androidx.lifecycle.ViewModel

class ListFragmentViewModel(
    repository: ListFragmentFakeRepository
) : ViewModel() {

    val items = repository.getItems()

}