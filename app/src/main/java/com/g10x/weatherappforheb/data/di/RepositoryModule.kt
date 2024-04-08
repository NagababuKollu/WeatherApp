package com.g10x.weatherappforheb.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.g10x.weatherappforheb.data.network.WeatherApi
import com.g10x.weatherappforheb.data.repository.WeatherRepositoryImpl
import com.g10x.weatherappforheb.domain.repository.WeatherRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(weatherApi: WeatherApi): WeatherRepository =
        WeatherRepositoryImpl(weatherApi)
}