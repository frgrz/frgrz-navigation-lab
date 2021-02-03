package com.frgrz.navigation.datasource

import com.frgrz.navigation.features.list.ListItemData

class FruitsFakeDataSource {

    private val fakeDataSet = listOf(
        ListItemData(0, "Banana"),
        ListItemData(1, "Kiwi"),
        ListItemData(2, "Mango"),
        ListItemData(3, "Apple"),
        ListItemData(4, "Peach")
    )

    fun getItems() = fakeDataSet

    fun getItem(itemId: Int) = fakeDataSet.first { it.id == itemId }
}