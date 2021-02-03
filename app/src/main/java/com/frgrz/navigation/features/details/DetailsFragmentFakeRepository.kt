package com.frgrz.navigation.features.details

import com.frgrz.navigation.datasource.FruitsFakeDataSource

class DetailsFragmentFakeRepository(
    private val dataSource: FruitsFakeDataSource
) {

    fun getItem(itemId: Int) = dataSource.getItem(itemId)

}