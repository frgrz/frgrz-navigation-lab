package com.frgrz.navigation.common

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("items")
    fun <T> recyclerItems(recyclerView: RecyclerView, data: T?) {
        recyclerView.adapter.tryCast<DataBindingAdapter<T>> {
            this.setData(data)
        }
    }
    
}