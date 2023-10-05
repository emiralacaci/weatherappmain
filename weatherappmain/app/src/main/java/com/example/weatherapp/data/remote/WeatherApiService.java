package com.example.weatherapp.data.remote;

import com.example.weatherapp.data.models.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiService {
    @GET("forecast")
    Call<WeatherData> getWeatherForecast(
            @Query("latitude") double latitude,
            @Query("longitude") double longitude,
            @Query("hourly") String hourlyParams,
            @Query("daily") String dailyParams,
            @Query("timezone") String timezone
    );
}
