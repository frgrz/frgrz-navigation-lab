package com.frgrz.navigation.features.list

class ListFragmentFakeRepository {

    private val fakeDataSet = listOf(
        ListItemData(0, "Banana"),
        ListItemData(1, "Kiwi"),
        ListItemData(2, "Mango"),
        ListItemData(3, "Apple"),
        ListItemData(4, "Peach")
    )

    fun getItems(): List<ListItemViewModel> {
        return fakeDataSet.map { ListItemViewModel(it) }
    }
}
