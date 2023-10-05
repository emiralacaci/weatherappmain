package com.example.weatherapp.ui.main_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.weatherapp.R;
import com.example.weatherapp.data.models.HourlyData;
import com.example.weatherapp.data.models.WeatherData;
import com.example.weatherapp.data.repositroy.WeatherApiManager;
import com.example.weatherapp.ui.main_page.adapters.HourlyForecastAdapter;
import com.example.weatherapp.utils.Constants;
import com.example.weatherapp.databinding.ActivityMainBinding;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private HourlyForecastAdapter hourlyForecastAdapter;
    private HourlyData hourlyData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        hourlyData = new HourlyData();
        GradientDrawable adapterBackgroundMorning = (GradientDrawable) getResources().getDrawable(R.drawable.adapter_background_morning);



        WeatherApiManager apiManager = new WeatherApiManager();
        Call<WeatherData> call = apiManager.getWeatherForecast(41.015137, 28.979530);

        call.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                if (response.isSuccessful()) {
                    WeatherData weatherData = response.body();
                    // weatherData içeriğini kullanabilirsiniz
                    hourlyData=weatherData.getHourly();
                    System.out.println("time: "+weatherData.getTimezone()+" "+weatherData.getTimezone_abbreviation());
                   Date date = new Date();
                   int currentHour = date.getHours()+3;

                   if(currentHour>23){
                       currentHour-=24;
                   }



                   //country name
                   binding.countryName.setText(weatherData.getTimezone());

                    //current weather icon
                    Drawable icon = ContextCompat.getDrawable(getBaseContext(), Constants.getIcon(hourlyData.getWeathercode().get(currentHour),currentHour));
                    binding.currentWeatherIcon.setImageDrawable(icon);


                   //daily temperature
                    binding.temperatureOfWeather.setText(String.valueOf(Math.round(hourlyData.getTemperature_2m().get(currentHour))));
                    binding.minMaxTemperature.setText(String.valueOf(Math.round(weatherData.getDaily().getTemperature_2m_min().get(0)))
                            +"-"+
                            String.valueOf(Math.round(weatherData.getDaily().getTemperature_2m_max().get(0))));

                    //hourly temperature
                    binding.hourlyForecastRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
                    hourlyForecastAdapter= new HourlyForecastAdapter(hourlyData);
                    binding.hourlyForecastRecyclerView.setAdapter(hourlyForecastAdapter);

                    //daily wind speed
                    binding.windSpeed.setText(String.valueOf(weatherData.getDaily().getWindspeed_10m_max().get(0)));

                    //daily precipitation probability max
                    binding.precipitationProbabilityMax.setText(String.valueOf(weatherData.getDaily().getPrecipitation_probability_max().get(0)));

                    //change background image and adapter's color according to time

                    if(currentHour <= 6 || currentHour >=20){
                        view.setBackgroundResource(R.drawable.night);
                        adapterBackgroundMorning.setColor(getResources().getColor(R.color.night_color));
                    }else {
                        view.setBackgroundResource(R.drawable.morning);
                        adapterBackgroundMorning.setColor(getResources().getColor(R.color.morning_color));
                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {

            }
        });




    }


}