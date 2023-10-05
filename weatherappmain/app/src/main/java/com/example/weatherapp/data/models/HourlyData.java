package com.example.weatherapp.data.models;

import java.util.List;

public class HourlyData {
    private List<String> time;
    private List<Double> temperature_2m;
    private List<Integer> weathercode;

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Double> getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(List<Double> temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public List<Integer> getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(List<Integer> weathercode) {
        this.weathercode = weathercode;
    }
}
