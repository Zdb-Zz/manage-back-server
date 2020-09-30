package com.zdb.demo.service;

import com.github.pagehelper.Page;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zdb.demo.entity.City;
import org.springframework.web.bind.annotation.RequestParam;

public interface CityService {
    String getCityNameById(Integer cityId);

    Page<City> getCityList(Integer pageIndex,Integer pageSize,String city,String name, String scenicSpot);

    Boolean addCity(City city);

    Boolean updateCity(City city);
    
    Boolean delCity(Integer id);
}
