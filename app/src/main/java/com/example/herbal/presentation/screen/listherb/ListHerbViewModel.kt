package com.example.herbal.presentation.screen.listherb

import androidx.lifecycle.ViewModel
import com.example.herbal.data.datastore.FilterData
import com.example.herbal.data.datastore.categoryList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class ListHerbViewModel : ViewModel() {
    private val _filter = MutableStateFlow(categoryList)
    val filters: StateFlow<List<FilterData>> = _filter

    private val _selectedCategory = MutableStateFlow("")
    val selectedCategory: StateFlow<String> = _selectedCategory
    fun toggleFilter(index: Int) {
        _filter.update { currentFilter ->
            currentFilter.mapIndexed { i, filter ->
                filter.copy(isActive = i == index).also {
                    if (i == index) {
                        _selectedCategory.update { filter.category }
                    }
                }
            }
        }
    }
}