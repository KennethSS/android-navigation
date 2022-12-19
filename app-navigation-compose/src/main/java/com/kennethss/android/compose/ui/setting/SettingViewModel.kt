package com.kennethss.android.compose.ui.setting

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.kennethss.android.compose.ui.setting.navigation.KEY_ID

class SettingViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {


    init {
        Log.d("SettingViewModel", "id: ${savedStateHandle[KEY_ID] ?: 0}")
    }
}