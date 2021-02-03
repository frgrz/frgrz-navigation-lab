package com.frgrz.navigation.features.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frgrz.navigation.databinding.HomeFragmentBinding
import dagger.Lazy
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class HomeFragment : Fragment() {

    private lateinit var binding: HomeFragmentBinding

    @Inject
    lateinit var viewModel: Lazy<HomeFragmentViewModel>

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeFragmentBinding.inflate(inflater, null, false)
        binding.viewModel = viewModel.get()
        return binding.root
    }
}