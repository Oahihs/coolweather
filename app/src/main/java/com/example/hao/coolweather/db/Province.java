package com.example.hao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Hao on 2017/10/21.
 * 用于存储省份信息
 */

public class Province extends DataSupport {
    int id;
    String provinceName;
    int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
