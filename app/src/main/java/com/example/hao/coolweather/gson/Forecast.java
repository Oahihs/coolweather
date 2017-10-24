package com.example.hao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hao on 2017/10/22.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;
    public class More{
        @SerializedName("cond")
        public String info;
    }
    public class Temperature{
        public String max;
        public String min;
    }
}
