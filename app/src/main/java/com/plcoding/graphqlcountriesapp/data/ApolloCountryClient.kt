package com.plcoding.graphqlcountriesapp.data

import com.apollographql.apollo3.ApolloClient
import com.plcoding.CountriesQuery
import com.plcoding.graphqlcountriesapp.domain.CountryClient
import com.plcoding.graphqlcountriesapp.domain.DetailCountry
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
) : CountryClient{
    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map{}

    }

    override suspend fun getCountry(code: String): DetailCountry? {
        TODO("Not yet implemented")
    }
}