package com.example.weatherapp.ui.main_page.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.data.models.HourlyData;
import com.example.weatherapp.utils.Constants;
import com.example.weatherapp.databinding.AdapterHourlyForecastBinding;

public class HourlyForecastAdapter extends RecyclerView.Adapter<HourlyForecastAdapter.ViewHolder> {
    private HourlyData hourlyData;
    private ViewGroup parent;
    public HourlyForecastAdapter(HourlyData hourlyData) {
        this.hourlyData=hourlyData;
    }

    public void setHourlyData(HourlyData hourlyData){
        this.hourlyData=hourlyData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        AdapterHourlyForecastBinding binding = AdapterHourlyForecastBinding.inflate(inflater,parent,false);
        this.parent=parent;
        return new ViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tempreture.setText(hourlyData.getTemperature_2m().get(position).toString());
        holder.binding.time.setText(hourlyData.getTime().get(position).substring(11,16));
        int currentHour = Integer.parseInt(hourlyData.getTime().get(position).substring(11,13));
        Drawable icon = ContextCompat.getDrawable(parent.getContext(), Constants.getIcon(hourlyData.getWeathercode().get(position),currentHour));
        holder.binding.weatherIcon.setImageDrawable(icon);
    }

    @Override
    public int getItemCount() {

        return 24;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final AdapterHourlyForecastBinding binding;
        public ViewHolder(AdapterHourlyForecastBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
