package com.plcoding.graphqlcountriesapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class) //making sure that all this files in this package live as longs as the application
object AppModule {


}