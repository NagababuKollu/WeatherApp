package com.g10x.weatherappforheb.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.g10x.weatherappforheb.domain.repository.WeatherRepository
import com.g10x.weatherappforheb.domain.usecase.GetWeatherForecastUseCase
import com.g10x.weatherappforheb.domain.usecase.GetWeatherForecastUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideWeatherUseCase(weatherRepository: WeatherRepository): GetWeatherForecastUseCase =
        GetWeatherForecastUseCaseImpl(weatherRepository)
}