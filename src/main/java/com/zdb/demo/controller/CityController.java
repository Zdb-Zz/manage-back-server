package com.zdb.demo.controller;

import com.github.pagehelper.Page;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zdb.demo.entity.City;
import com.zdb.demo.service.CityService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/city")
public class CityController {

    @Resource
    CityService cityService;

    @GetMapping("getCityList")
    public Map<String, Object> getCityList(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                           @RequestParam(value = "city", required = false) String city,
                                           @RequestParam(value = "name", required = false) String name,
                                           @RequestParam(value = "scenicSpot", required = false) String scenicSpot) {

        Page<City> cityList = cityService.getCityList(pageIndex, pageSize, city, name, scenicSpot);
        if (cityList != null && cityList.size() > 0) {
            return ResultUtil.listResult(cityList.getPageNum(), cityList.getPageSize(), (int) cityList.getTotal(), cityList.getResult());
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }


    @PostMapping("addCity")
    public Map<String,Object> addCity(@RequestBody City city){
        Boolean isSuccess = cityService.addCity(city);
        if (isSuccess ) {
            return ResultUtil.resultSuccess("添加景点成功", null, null);
        } else {
            return ResultUtil.resultFail("添加景点失败", null, null);
        }
    }

    @PostMapping("updateCity")
    public Map<String,Object> updateCity(@RequestBody City city){
        Boolean isSuccess = cityService.updateCity(city);
        if (isSuccess ) {
            return ResultUtil.resultSuccess("修改景点成功", null, null);
        } else {
            return ResultUtil.resultFail("修改景点失败", null, null);
        }
    }

    @GetMapping("delCity")
    public Map<String,Object> delCity(@RequestParam(value = "id")Integer id){
        Boolean isSuccess = cityService.delCity(id);
        if (isSuccess ) {
            return ResultUtil.resultSuccess("删改景点成功", null, null);
        } else {
            return ResultUtil.resultFail("删改景点失败", null, null);
        }
    }
}
