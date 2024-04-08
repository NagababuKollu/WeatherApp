package com.g10x.weatherappforheb.domain.usecase

import com.g10x.weatherappforheb.domain.model.Weather
import com.g10x.weatherappforheb.utils.Result
import kotlinx.coroutines.flow.Flow


interface GetWeatherForecastUseCase {
    operator fun invoke(city: String): Flow<Result<Weather>>
}