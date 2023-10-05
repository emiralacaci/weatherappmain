package com.example.weatherapp.utils;

import com.example.weatherapp.R;

public class Constants {
    public static int getIcon(int weatherCode, int currentHour){

            if(currentHour <= 6 || currentHour >= 20){
                switch (weatherCode){
                    case 0: return R.drawable.ic_clear;
                    case 1: return R.drawable.ic_partly_cloud_night;
                    case 2: return R.drawable.ic_partly_cloud_night;
                    case 3: return R.drawable.ic_partly_cloud_night;
                    case 45: return R.drawable.ic_fog;
                    case 48: return R.drawable.ic_fog;
                    case 51: return R.drawable.ic_drizzle;
                    case 53: return R.drawable.ic_drizzle;
                    case 55: return R.drawable.ic_drizzle;
                    case 56: return R.drawable.ic_freezing_drizzle;
                    case 57: return R.drawable.ic_freezing_drizzle;
                    case 61: return R.drawable.ic_rainy;
                    case 63: return R.drawable.ic_rainy;
                    case 65: return R.drawable.ic_rainy;
                    case 66: return R.drawable.ic_freezing_rainy;
                    case 67: return R.drawable.ic_freezing_rainy;
                    case 71: return R.drawable.ic_snow_fall;
                    case 73: return R.drawable.ic_snow_fall;
                    case 75: return R.drawable.ic_snow_fall;
                    case 77: return R.drawable.ic_snow_grain;
                    case 80: return R.drawable.ic_rainy;
                    case 81: return R.drawable.ic_rainy;
                    case 82: return R.drawable.ic_rainy;
                    case 85: return R.drawable.ic_snow_fall;
                    case 86: return R.drawable.ic_snow_fall;
                    case 95: return R.drawable.ic_thunderstorm;
                    case 96: return R.drawable.ic_thunderstorm_heavy;
                    case 99: return R.drawable.ic_thunderstorm_heavy;
                    default: return R.drawable.ic_clear_night;
                }
            }else {
                switch (weatherCode){
                    case 0: return R.drawable.ic_clear;
                    case 1: return R.drawable.ic_partly_cloud;
                    case 2: return R.drawable.ic_partly_cloud;
                    case 3: return R.drawable.ic_partly_cloud;
                    case 45: return R.drawable.ic_fog;
                    case 48: return R.drawable.ic_fog;
                    case 51: return R.drawable.ic_drizzle;
                    case 53: return R.drawable.ic_drizzle;
                    case 55: return R.drawable.ic_drizzle;
                    case 56: return R.drawable.ic_freezing_drizzle;
                    case 57: return R.drawable.ic_freezing_drizzle;
                    case 61: return R.drawable.ic_rainy;
                    case 63: return R.drawable.ic_rainy;
                    case 65: return R.drawable.ic_rainy;
                    case 66: return R.drawable.ic_freezing_rainy;
                    case 67: return R.drawable.ic_freezing_rainy;
                    case 71: return R.drawable.ic_snow_fall;
                    case 73: return R.drawable.ic_snow_fall;
                    case 75: return R.drawable.ic_snow_fall;
                    case 77: return R.drawable.ic_snow_grain;
                    case 80: return R.drawable.ic_rainy;
                    case 81: return R.drawable.ic_rainy;
                    case 82: return R.drawable.ic_rainy;
                    case 85: return R.drawable.ic_snow_fall;
                    case 86: return R.drawable.ic_snow_fall;
                    case 95: return R.drawable.ic_thunderstorm;
                    case 96: return R.drawable.ic_thunderstorm_heavy;
                    case 99: return R.drawable.ic_thunderstorm_heavy;
                    default: return R.drawable.ic_clear;
                }
            }

    }
}
