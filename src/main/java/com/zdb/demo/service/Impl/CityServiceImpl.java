package com.zdb.demo.service.Impl;

import com.zdb.demo.mapper.CityMapper;
import com.zdb.demo.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("cityService")
public class CityServiceImpl implements CityService {

    @Resource
    CityMapper cityMapper;

    @Override
    public String getCityNameById(Integer cityId) {
        return cityMapper.selectByPrimaryKey(cityId).getName();
    }
}
