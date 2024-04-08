package com.g10x.weatherappforheb.domain.usecase

import com.g10x.weatherappforheb.domain.model.Weather
import com.g10x.weatherappforheb.domain.repository.WeatherRepository
import com.g10x.weatherappforheb.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetWeatherForecastUseCaseImpl @Inject constructor(
    private val weatherRepository: WeatherRepository
) : GetWeatherForecastUseCase {
    override fun invoke(city: String): Flow<Result<Weather>> = flow {
        emit(Result.Loading)
        try {
            val response = weatherRepository.getWeatherForecast(city)
            emitAll(response)
        } catch (e: Exception) {
            emit(Result.Error(e.message.orEmpty()))
        }
    }.flowOn(Dispatchers.IO)
}