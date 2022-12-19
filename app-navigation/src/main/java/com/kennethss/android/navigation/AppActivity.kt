package com.kennethss.android.navigation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.kennethss.android.navigation.databinding.ActivityMainBinding
import com.kennethss.android.navigation.ui.MainFragment
import com.kennethss.android.navigation.ui.MainFragmentDirections

class AppActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<AppViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycleScope.launchWhenStarted {
            viewModel.navigate.collect { navigator ->
                when (navigator) {
                    is AppNavigator.Setting -> {
                        findNavController(R.id.fragmentContainer).navigate(
                            MainFragmentDirections.actionHomeFragmentToSettingFragment()
                        )
                    }
                }
            }
        }
    }
}

