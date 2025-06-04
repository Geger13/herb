package com.example.herbal.presentation.screen.listherb

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.herbal.data.datastore.MyHerbData
import com.example.herbal.data.datastore.myHerbData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class ListHerbViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _allPlants = MutableStateFlow(myHerbData)
    val query: StateFlow<String> = savedStateHandle.getStateFlow("query", "")

    val herbList: StateFlow<List<MyHerbData>> = query
        .combine(_allPlants) { q, plants ->
            if (q.isBlank()) {
                plants
            } else {
                plants.filter { it.name.contains(q, ignoreCase = true) }
            }
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = myHerbData
        )
}