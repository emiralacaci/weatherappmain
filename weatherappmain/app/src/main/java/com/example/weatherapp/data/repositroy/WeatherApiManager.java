package com.example.weatherapp.data.repositroy;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.weatherapp.data.models.WeatherData;
import com.example.weatherapp.data.remote.WeatherApiService;

public class WeatherApiManager {
    private static final String BASE_URL = "https://api.open-meteo.com/v1/";

    private WeatherApiService weatherApiService;

    public WeatherApiManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherApiService = retrofit.create(WeatherApiService.class);
    }

    public Call<WeatherData> getWeatherForecast(double latitude, double longitude) {
        String hourlyParams = "temperature_2m,weathercode";
        String dailyParams = "weathercode,temperature_2m_max,temperature_2m_min,uv_index_max,precipitation_probability_max,windspeed_10m_max";
        String timezone = "auto";

        return weatherApiService.getWeatherForecast(latitude, longitude, hourlyParams, dailyParams, timezone);
    }
}
