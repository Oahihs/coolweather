package com.example.hao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Hao on 2017/10/21.
 */

public class City extends DataSupport {
    int id;
    String cityName;
    int cityCode;
    int provinceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceCode) {
        this.provinceId = provinceCode;
    }
}
