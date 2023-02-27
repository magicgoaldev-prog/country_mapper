package com.plcoding.graphqlcountriesapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry

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
                    CountryItem( //recyclerview to show every countries
                        country = country,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onSelectedCountry(country.code) }
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun CountryItem( //fun to show each emoji/country and capital
    country: SimpleCountry,
    modifier: Modifier = Modifier
){
    Row( //element that holds everything that you put in it with a horizontal line
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = country.emoji,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.width(16.dp)) //just a spacer to organize each country sepaartion
        Column(
            modifier = Modifier.weight(1f) //spand the column till the end remainig space
        ) {
            Text(
                text = country.name,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = country.capital) //simple text to show country capital bellow the city
        }

    }
}