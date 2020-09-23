package com.zdb.demo.service;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.Travels;

import java.util.Date;

public interface TravelService {
    /**
     * 获取游记列表
     * @param pageIndex
     * @param pageSize
     * @param username
     * @param location
     * @param startTime
     * @param endTime
     * @return
     */
    Page<Travels> getTravelList(Integer pageIndex, Integer pageSize, String username, String location, String startTime, String endTime);

    /**
     * 删除游记
     * @param answerId
     * @return
     */
    Boolean deleteTravel(Integer answerId);
}
