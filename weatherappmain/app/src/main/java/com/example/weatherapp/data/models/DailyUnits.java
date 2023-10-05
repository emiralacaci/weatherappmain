package com.example.weatherapp.data.models;

public class DailyUnits {
    private String time;
    private String weathercode;
    private String temperature_2m_max;
    private String temperature_2m_min;
    private String uv_index_max;
    private String precipitation_probability_max;
    private String windspeed_10m_max;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(String weathercode) {
        this.weathercode = weathercode;
    }

    public String getTemperature_2m_max() {
        return temperature_2m_max;
    }

    public void setTemperature_2m_max(String temperature_2m_max) {
        this.temperature_2m_max = temperature_2m_max;
    }

    public String getTemperature_2m_min() {
        return temperature_2m_min;
    }

    public void setTemperature_2m_min(String temperature_2m_min) {
        this.temperature_2m_min = temperature_2m_min;
    }

    public String getUv_index_max() {
        return uv_index_max;
    }

    public void setUv_index_max(String uv_index_max) {
        this.uv_index_max = uv_index_max;
    }

    public String getPrecipitation_probability_max() {
        return precipitation_probability_max;
    }

    public void setPrecipitation_probability_max(String precipitation_probability_max) {
        this.precipitation_probability_max = precipitation_probability_max;
    }

    public String getWindspeed_10m_max() {
        return windspeed_10m_max;
    }

    public void setWindspeed_10m_max(String windspeed_10m_max) {
        this.windspeed_10m_max = windspeed_10m_max;
    }
}
