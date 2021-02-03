package com.frgrz.navigation.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frgrz.navigation.R
import dagger.Lazy
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: Lazy<MainActivityViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}