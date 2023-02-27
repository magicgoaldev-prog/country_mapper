package com.plcoding.graphqlcountriesapp.di

import com.apollographql.apollo3.ApolloClient
import com.plcoding.graphqlcountriesapp.data.ApolloCountryClient
import com.plcoding.graphqlcountriesapp.domain.CountryClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //making sure that all this files in this package live as longs as the application
object AppModule {

    @Provides //making sure that dagger hilt will provide the class to generate the depencencies (like ApolloClient)
    @Singleton
    fun provideApolloCliente() : ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("http://countries.trevorblades.com/graphql")
            .build()
    }

    @Provides
    @Singleton
    fun provideCountryClient(apolloClient: ApolloClient) : CountryClient{ //country client needs apollo cliente
        return ApolloCountryClient(apolloClient)
    }
}