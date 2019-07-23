package com.itqf.service.impl;

import com.itqf.mapper.HouseInfoMapper;
import com.itqf.pojo.HouseInfo;
import com.itqf.service.HouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseInfoServiceImpl implements HouseInfoService {

    @Resource
    private HouseInfoMapper houseInfoMapper;

    @Override
    public boolean saveHouseInfo(HouseInfo houseInfo) {
        return houseInfoMapper.saveHouseInfo(houseInfo)>0;
    }

    @Override
    public List<HouseInfo> findAll() {
        return houseInfoMapper.findAll();
    }
}
