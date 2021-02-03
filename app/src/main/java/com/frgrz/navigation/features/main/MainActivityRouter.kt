package com.frgrz.navigation.features.main

import android.app.Activity
import androidx.annotation.IdRes
import com.frgrz.navigation.features.home.HomeFragmentDirections
import com.frgrz.navigation.features.home.HomeNavigation
import com.frgrz.navigation.router.NavigationRouter

class MainActivityRouter(
    activity: Activity,
    @IdRes private val rootFragmentId: Int,
    @IdRes private val navHostFragmentId: Int
) : NavigationRouter(activity, rootFragmentId, navHostFragmentId),
    HomeNavigation {

    override fun navigateToListFragment() {
        to(
            HomeFragmentDirections
                .actionHomeFragmentToListFragment()
        )
    }
}