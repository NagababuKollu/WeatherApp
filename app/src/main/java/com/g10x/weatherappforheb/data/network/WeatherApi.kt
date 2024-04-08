package com.g10x.weatherappforheb.data.network

import com.g10x.weatherappforheb.BuildConfig
import com.g10x.weatherappforheb.data.model.ForecastResponse
import com.g10x.weatherappforheb.utils.DEFAULT_WEATHER_DESTINATION
import com.g10x.weatherappforheb.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse

}