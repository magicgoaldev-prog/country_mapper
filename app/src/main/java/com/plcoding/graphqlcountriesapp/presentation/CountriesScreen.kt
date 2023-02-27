package com.plcoding.graphqlcountriesapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CountriesScreen(
    state: CountriesViewModel.CountriesState,
    onSelectedCountry: (code: String) -> Unit,
    onDismissCountryDialog: () -> Unit
){
    Box(modifier = Modifier.fillMaxSize() ){
        if (state.isLoading){
            CircularProgressIndicator()
        }
    }
}