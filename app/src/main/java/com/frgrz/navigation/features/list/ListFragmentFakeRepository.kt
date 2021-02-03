package com.frgrz.navigation.features.list

import com.frgrz.navigation.datasource.FruitsFakeDataSource
class ListFragmentFakeRepository(
    private val dataSource: FruitsFakeDataSource
) {

    fun getItemViewModels(navigation: ListFragmentNavigation): List<ListItemViewModel> {
        return dataSource.getItems().map { ListItemViewModel(it, navigation) }
    }

}
