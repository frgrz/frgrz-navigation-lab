package com.frgrz.navigation.features.list

class ListItemViewModel(
    private val data: ListItemData,
    private val navigation: ListFragmentNavigation
) {

    val name = data.name

    fun navigate() {
        navigation.navigateToDetailsFragment(data.id)
    }

}
