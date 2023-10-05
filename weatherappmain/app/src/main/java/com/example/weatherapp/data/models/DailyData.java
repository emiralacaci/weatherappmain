package com.example.weatherapp.data.models;

import java.util.List;

public class DailyData {
    private List<String> time;
    private List<Integer> weathercode;
    private List<Double> temperature_2m_max;
    private List<Double> temperature_2m_min;
    private List<Double> uv_index_max;
    private List<Integer> precipitation_probability_max;
    private List<Double> windspeed_10m_max;

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Integer> getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(List<Integer> weathercode) {
        this.weathercode = weathercode;
    }

    public List<Double> getTemperature_2m_max() {
        return temperature_2m_max;
    }

    public void setTemperature_2m_max(List<Double> temperature_2m_max) {
        this.temperature_2m_max = temperature_2m_max;
    }

    public List<Double> getTemperature_2m_min() {
        return temperature_2m_min;
    }

    public void setTemperature_2m_min(List<Double> temperature_2m_min) {
        this.temperature_2m_min = temperature_2m_min;
    }

    public List<Double> getUv_index_max() {
        return uv_index_max;
    }

    public void setUv_index_max(List<Double> uv_index_max) {
        this.uv_index_max = uv_index_max;
    }

    public List<Integer> getPrecipitation_probability_max() {
        return precipitation_probability_max;
    }

    public void setPrecipitation_probability_max(List<Integer> precipitation_probability_max) {
        this.precipitation_probability_max = precipitation_probability_max;
    }

    public List<Double> getWindspeed_10m_max() {
        return windspeed_10m_max;
    }

    public void setWindspeed_10m_max(List<Double> windspeed_10m_max) {
        this.windspeed_10m_max = windspeed_10m_max;
    }
}
