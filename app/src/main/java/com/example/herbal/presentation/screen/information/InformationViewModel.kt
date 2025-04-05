package com.example.herbal.presentation.screen.information

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.datastore.myHerbData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class InformationViewModel @Inject constructor() : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    private val _informationByCategory = MutableStateFlow<List<MyHerbData>>(myHerbData)
    val informationByCategory: StateFlow<List<MyHerbData>> = _informationByCategory

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
        _informationByCategory.value = if (query.isBlank()) {
            myHerbData
        } else {
            myHerbData.filter {
                it.name.contains(query, ignoreCase = true) ||
                        it.sasak_name.contains(query, ignoreCase = true)
            }
        }
    }
}

