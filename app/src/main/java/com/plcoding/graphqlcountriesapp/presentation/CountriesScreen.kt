package com.plcoding.graphqlcountriesapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CountriesScreen(
    state: CountriesViewModel.CountriesState,
    onSelectedCountry: (code: String) -> Unit,
    onDismissCountryDialog: () -> Unit
){
    Box(modifier = Modifier.fillMaxSize() ){
        if (state.isLoading){
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }else{
            LazyColumn(modifier = Modifier.fillMaxSize()){
                items(state.countries) { country ->

                }
            }
        }
    }
}