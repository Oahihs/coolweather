package com.example.hao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Hao on 2017/10/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
