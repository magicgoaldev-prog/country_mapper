package com.plcoding.graphqlcountriesapp.data

import com.plcoding.CountryQuery
import com.plcoding.graphqlcountriesapp.domain.DetailCountry


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