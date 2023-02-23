package com.plcoding.graphqlcountriesapp.data

import com.plcoding.CountriesQuery
import com.plcoding.CountryQuery
import com.plcoding.graphqlcountriesapp.domain.DetailCountry
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry


fun CountryQuery.Country.toDetailCountry() : DetailCountry {
    return DetailCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital?: "No capital",
        currency = code,
        languages = languages.mapNotNull {it.name},
        continent = continent.name
    )
}

fun CountriesQuery.Country.toDetailCountry() : SimpleCountry {
    return SimpleCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital?: "No capital"
    )
}
