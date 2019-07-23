package com.itqf.mapper;

import com.itqf.pojo.HouseInfo;

import java.util.List;


public interface HouseInfoMapper {

    public  int saveHouseInfo(HouseInfo houseInfo);

    public List<HouseInfo> findAll();

}
