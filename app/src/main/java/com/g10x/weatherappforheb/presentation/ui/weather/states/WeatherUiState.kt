package com.g10x.weatherappforheb.presentation.ui.weather.states

import com.g10x.weatherappforheb.domain.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
