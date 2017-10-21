package com.example.hao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Hao on 2017/10/21.
 */

public class County extends DataSupport {
    int id;
    String countyName;
    int weatherId;
    int cityCode;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
