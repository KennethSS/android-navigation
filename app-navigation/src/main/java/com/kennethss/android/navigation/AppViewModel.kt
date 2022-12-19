package com.kennethss.android.navigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class AppViewModel : ViewModel() {
    private val _navigate = MutableSharedFlow<AppNavigator>()
    val navigate = _navigate.asSharedFlow()

    fun navigateToSetting(id: Int) = viewModelScope.launch {
        _navigate.emit(AppNavigator.Setting(id = id))
    }
}