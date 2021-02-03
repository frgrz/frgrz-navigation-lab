package com.frgrz.navigation.features.details

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.frgrz.navigation.features.list.ListItemData

class DetailsFragmentViewModel(
    private val repository: DetailsFragmentFakeRepository
) : ViewModel() {

    private var fruitItem: ListItemData? = null

    val name = ObservableField<String>()

    fun setDetailsId(detailsId: Int) {
        fruitItem = repository.getItem(detailsId)
        name.set(fruitItem?.name)
    }

}
