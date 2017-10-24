package com.example.hao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Hao on 2017/10/21.
 */

public class County extends DataSupport {
    int id;
    String countyName;
    String weatherId;
    int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
