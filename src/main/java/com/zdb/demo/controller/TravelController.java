package com.zdb.demo.controller;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.Travels;
import com.zdb.demo.entity.User;
import com.zdb.demo.service.TravelService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/travel")
public class TravelController {

    @Resource
    TravelService travelService;

    /**
     * 获取话题列表
     * @param pageIndex
     * @param pageSize
     * @param username
     * @param location
     * @param startTime
     * @param endTime
     * @return
     */
    @GetMapping("/getTravelList")
    public Map<String,Object> getTravelList(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                          @RequestParam(value = "username",required = false) String username,
                                          @RequestParam(value = "location",required = false) String location,
                                          @RequestParam(value = "startTime",required = false) String startTime,
                                          @RequestParam(value = "endTime",required = false) String endTime
    ){
        Page<Travels> Travels = travelService.getTravelList(pageIndex,pageSize,username,location,startTime,endTime);
        if(Travels!=null && Travels.size()>0){
            return ResultUtil.listResult(Travels.getPageNum(),Travels.getPageSize(), (int) Travels.getTotal(),Travels.getResult());
        }else{
            return ResultUtil.resultFail("获取话题列表失败", null, null);
        }
    }

    @GetMapping("/delTravel")
    public Map<String,Object> delTravel(@RequestParam(value = "answerId",required = false) Integer answerId){
       Boolean isSuccess = travelService.deleteTravel(answerId);
        if(isSuccess){
            return ResultUtil.resultSuccess("删除游记列表成功", null, null);
        }else{
            return ResultUtil.resultFail("删除游记列表失败", null, null);
        }
    }

}
