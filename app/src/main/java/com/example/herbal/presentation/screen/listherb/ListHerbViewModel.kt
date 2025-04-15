package com.example.herbal.presentation.screen.listherb

import androidx.lifecycle.ViewModel
import com.example.herbal.data.datastore.FilterData
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.datastore.categoryList
import com.example.herbal.data.datastore.myHerbData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
open class ListHerbViewModel @Inject constructor() : ViewModel() {
    // Provide the entire list of herbs without filtering by category
    private val _herbList = MutableStateFlow(myHerbData) // List of all herbs
    open val herbList: StateFlow<List<MyHerbData>> = _herbList

    // Optionally, you could add logic for managing any other states
}
