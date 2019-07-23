package com.itqf.service;

import com.itqf.pojo.HouseInfo;

import java.util.List;


public interface HouseInfoService {

    public  boolean saveHouseInfo(HouseInfo houseInfo);

    public List<HouseInfo> findAll();
}
