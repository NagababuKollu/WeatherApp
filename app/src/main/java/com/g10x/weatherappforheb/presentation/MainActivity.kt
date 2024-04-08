package com.g10x.weatherappforheb.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.g10x.weatherappforheb.presentation.ui.weather.WeatherScreen
import dagger.hilt.android.AndroidEntryPoint
import com.g10x.weatherappforheb.theme.WeatherTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTheme {
                WeatherScreen()
            }
        }
    }
}
