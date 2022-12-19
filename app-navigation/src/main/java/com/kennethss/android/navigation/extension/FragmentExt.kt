package com.kennethss.android.navigation.extension

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

fun Fragment.safeNavigate(directions: NavDirections) {
    try {
        findNavController().navigate(directions)
    } catch (e: Exception) {
        if (e.isAlreadyNavigated()) {
            e.printStackTrace()
        } else {
            throw e
        }
    }
}


private fun Exception.isAlreadyNavigated() =
    this is IllegalArgumentException && this.message?.contains("cannot be found from the current destination") == true