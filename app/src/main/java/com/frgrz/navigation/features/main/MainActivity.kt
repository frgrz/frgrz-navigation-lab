package com.frgrz.navigation.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.frgrz.navigation.R
import com.frgrz.navigation.databinding.MainActivityBinding
import dagger.Lazy
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    private lateinit var binding: MainActivityBinding

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var viewModel: Lazy<MainActivityViewModel>

    override fun androidInjector(): AndroidInjector<Any> = fragmentInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel.get()
    }

}