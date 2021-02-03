package com.frgrz.navigation.features.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.frgrz.navigation.common.DataBindingAdapter
import com.frgrz.navigation.common.tryCast
import com.frgrz.navigation.databinding.ListItemBinding

class ListItemAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    DataBindingAdapter<List<ListItemViewModel>> {

    private var items = listOf<ListItemViewModel>()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.tryCast<PaletteItemViewHolder> {
            bind(items[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater,parent, false)
        return PaletteItemViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun setData(data: List<ListItemViewModel>?) {
        data ?: return
        items = data
        notifyDataSetChanged()
    }

    class PaletteItemViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ListItemViewModel) {
            binding.viewModel = item
        }
    }
}
