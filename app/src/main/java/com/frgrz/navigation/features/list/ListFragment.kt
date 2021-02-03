package com.frgrz.navigation.features.list

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frgrz.navigation.databinding.ListFragmentBinding
import dagger.Lazy
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class ListFragment : Fragment() {

    private lateinit var binding: ListFragmentBinding

    @Inject
    lateinit var viewModel: Lazy<ListFragmentViewModel>

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListFragmentBinding.inflate(inflater, null, false)
        binding.listRecyclerView.adapter = ListItemAdapter()
        binding.viewModel = viewModel.get()
        return binding.root
    }
}