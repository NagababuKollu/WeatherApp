package com.g10x.weatherappforheb.domain.model

import com.g10x.weatherappforheb.data.model.ForecastResponse.Current.Condition
import com.g10x.weatherappforheb.domain.model.Forecast

data class Weather(
    val temperature: Int,
    val date: String,
    val wind: Int,
    val humidity: Int,
    val feelsLike: Int,
    val condition: Condition,
    val uv: Int,
    val name: String,
    val country: String,
    val forecasts: List<Forecast>
)
