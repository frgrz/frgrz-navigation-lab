package com.frgrz.navigation.features.details

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frgrz.navigation.databinding.DetailsFragmentBinding
import com.frgrz.navigation.databinding.ListFragmentBinding
import dagger.Lazy
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class DetailsFragment : Fragment() {

    private lateinit var binding: DetailsFragmentBinding

    @Inject
    lateinit var viewModel: Lazy<DetailsFragmentViewModel>

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DetailsFragmentBinding.inflate(inflater, null, false)
        binding.viewModel = viewModel.get()
        return binding.root
    }
}