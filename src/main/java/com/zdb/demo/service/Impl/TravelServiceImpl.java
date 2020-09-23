package com.zdb.demo.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zdb.demo.entity.Travels;
import com.zdb.demo.entity.TravelsExample;
import com.zdb.demo.entity.User;
import com.zdb.demo.entity.UserExample;
import com.zdb.demo.mapper.TravelsMapper;
import com.zdb.demo.mapper.UserMapper;
import com.zdb.demo.service.TravelService;
import com.zdb.demo.util.DateUtilJava8;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("travelService")
public class TravelServiceImpl implements TravelService {

    @Resource
    TravelsMapper travelsMapper;

    @Resource
    UserMapper userMapper;

    @Override
    public Page<Travels> getTravelList(Integer pageIndex, Integer pageSize, String username, String location, String startTime, String endTime) {
//        HashMap<String, Object> map = new HashMap<>();
        List<Integer> userIdList = new ArrayList<>();
        //通过用户名模糊搜索获得用户id列表
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameLike(username);
        List<User> users = userMapper.selectByExample(userExample);

        for (User user : users) {
            userIdList.add(user.getUserId());
        }
        TravelsExample travelsExample = new TravelsExample();
        TravelsExample.Criteria criteria1 = travelsExample.createCriteria();
        if (userIdList != null && userIdList.size() > 0) {
            criteria1.andUserIdIn(userIdList);
        }
        if (location != null && !location.equals("")) {
            criteria1.andLocationLike(location);
        }
        if (startTime != null && !startTime.equals("") && endTime != null && !endTime.equals("")) {
            criteria1.andCreatetimeBetween(DateUtilJava8.StringToDate(startTime), DateUtilJava8.StringToDate(endTime));
        }
        String orderBy = "createTime desc";
        PageHelper.startPage(pageIndex, pageSize, orderBy);
        Page<Travels> travels = (Page<Travels>) travelsMapper.selectByExample(travelsExample);
        for (Travels travel : travels) {
            travel.setUserName(userMapper.selectByPrimaryKey(travel.getUserId()).getUsername());
        }
        return travels;
    }

    @Override
    public Boolean deleteTravel(Integer answerId) {
        return 1 == travelsMapper.deleteByPrimaryKey(answerId);
    }
}
