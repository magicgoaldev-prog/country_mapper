package com.plcoding.graphqlcountriesapp.presentation

import androidx.lifecycle.ViewModel
import com.plcoding.graphqlcountriesapp.domain.DetailCountry
import com.plcoding.graphqlcountriesapp.domain.GetCountriesUseCase
import com.plcoding.graphqlcountriesapp.domain.GetCountryUseCase
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CountriesViewModel (
    private val getCountriesUseCase: GetCountriesUseCase,
    private val getCountryUseCase: GetCountryUseCase
    ) : ViewModel() {

    private val _state = MutableStateFlow(CountriesState())
    val state = _state.asStateFlow()

        data class CountriesState(
            val countries: List<SimpleCountry> = emptyList(),
            val isLoading: Boolean = false,
            val selectedCountry: DetailCountry? = null
        )
}