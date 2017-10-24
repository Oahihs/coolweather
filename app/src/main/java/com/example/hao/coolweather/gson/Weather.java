package com.example.hao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Hao on 2017/10/22.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;
    public AQI aqi;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
