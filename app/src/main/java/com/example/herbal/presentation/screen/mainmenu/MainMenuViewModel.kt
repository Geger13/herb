package com.example.herbal.presentation.screen.mainmenu

import androidx.lifecycle.ViewModel
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.datastore.myHerbData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor() : ViewModel() {

    private val _allPlants = MutableStateFlow(myHerbData)
    val allPlants: StateFlow<List<MyHerbData>> = _allPlants

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    fun onSearchQueryChange(newQuery: String) {
        _searchQuery.value = newQuery
    }
}