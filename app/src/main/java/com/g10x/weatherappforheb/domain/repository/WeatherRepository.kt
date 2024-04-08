package com.g10x.weatherappforheb.domain.repository

import com.g10x.weatherappforheb.domain.model.Weather
import com.g10x.weatherappforheb.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>

}