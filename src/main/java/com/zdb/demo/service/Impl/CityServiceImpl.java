package com.zdb.demo.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zdb.demo.entity.City;
import com.zdb.demo.entity.CityExample;
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

    @Override
    public Page<City> getCityList(Integer pageIndex, Integer pageSize,String city,String name, String scenicSpot) {
        CityExample cityExample = new CityExample();
        CityExample.Criteria criteria = cityExample.createCriteria();
        criteria.andCityLike(city);
        criteria.andNameLike(name);
        criteria.andScenicSpotLike(scenicSpot);
        PageHelper.startPage(pageIndex,pageSize);
        Page<City> cities = (Page<City>) cityMapper.selectByExample(cityExample);
        return cities;
    }

    @Override
    public Boolean addCity(City city) {
        if (city.getImgview()!=null){
            city.setImgview(city.getImgview().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImgview(city.getImgview().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg1()!=null){
            city.setImg1(city.getImg1().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg1(city.getImg1().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg2()!=null){
            city.setImg2(city.getImg2().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg2(city.getImg2().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg3()!=null){
            city.setImg3(city.getImg3().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg3(city.getImg3().toString().replace("http://120.55.48.156/",""));
        }
        return 1==cityMapper.insertSelective(city);
    }

    @Override
    public Boolean updateCity(City city) {
        if (city.getImgview()!=null){
            city.setImgview(city.getImgview().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImgview(city.getImgview().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg1()!=null){
            city.setImg1(city.getImg1().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg1(city.getImg1().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg2()!=null){
            city.setImg2(city.getImg2().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg2(city.getImg2().toString().replace("http://120.55.48.156/",""));
        }
        if (city.getImg3()!=null){
            city.setImg3(city.getImg3().toString().replace("C:/wwwroot/120.55.48.156//",""));
            city.setImg3(city.getImg3().toString().replace("http://120.55.48.156/",""));
        }

        return 1==cityMapper.updateByPrimaryKeySelective(city);
    }

    @Override
    public Boolean delCity(Integer id) {
        return 1==cityMapper.deleteByPrimaryKey(id);
    }

}
