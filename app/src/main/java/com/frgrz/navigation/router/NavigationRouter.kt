package com.frgrz.navigation.router

import android.app.Activity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import java.lang.ref.WeakReference

abstract class NavigationRouter(
    activity: Activity,
    @IdRes private val rootFragmentId: Int,
    @IdRes private val navControllerId: Int
) {

    private val navController: NavController by lazy { activity.findNavController(navControllerId) }

    protected val weakActivity = WeakReference(activity)

    protected fun action(@IdRes actionId: Int, bundle: Bundle?) {
        navController.navigate(actionId, bundle)
    }

    protected fun back() {
        navController.popBackStack()
    }

    protected fun backTo(@IdRes destinationId: Int, inclusive: Boolean = false) {
        navController.popBackStack(destinationId, inclusive)
    }

    protected fun to(directions: NavDirections) {
        navController.navigate(directions)
    }

    protected fun toRoot(inclusive: Boolean = false) {
        navController.popBackStack(rootFragmentId, inclusive)
    }

    protected fun closeActivity() {
        weakActivity.get()?.finish()
    }

}
