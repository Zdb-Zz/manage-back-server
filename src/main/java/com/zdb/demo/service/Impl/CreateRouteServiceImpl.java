package com.zdb.demo.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zdb.demo.entity.*;
import com.zdb.demo.mapper.CityMapper;
import com.zdb.demo.mapper.CreateRouteMapper;
import com.zdb.demo.mapper.UserMapper;
import com.zdb.demo.service.CreateRouteService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service("createRouteService")
public class CreateRouteServiceImpl implements CreateRouteService {
    @Resource
    CreateRouteMapper createRouteMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    CityMapper cityMapper;

    @Override
    public Page<CreateRoute> getRouteList(Integer pageIndex, Integer pageSize, String chooseCity, String username) {
        List<Integer> userIdList = new ArrayList<>();
        //根据用户名模糊搜索
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andUsernameLike(username);
        List<User> users = userMapper.selectByExample(userExample);
        for (User user : users) {
            userIdList.add(user.getUserId());
        }
        CreateRouteExample createRouteExample = new CreateRouteExample();
        CreateRouteExample.Criteria criteria = createRouteExample.createCriteria();
        if (userIdList != null && userIdList.size() > 0) {
            criteria.andUserIdIn(userIdList);
        }
        if (chooseCity != null && !chooseCity.equals("")) {
            criteria.andChooseCityLike(chooseCity);
        }
        PageHelper.startPage(pageIndex, pageSize);
        Page<CreateRoute> createRoutes = (Page<CreateRoute>) createRouteMapper.selectByExample(createRouteExample);
        for (CreateRoute createRoute : createRoutes) {
            ArrayList<String> cityNameArray = new ArrayList<>();
            User user = userMapper.selectByPrimaryKey(createRoute.getUserId());
            if (user != null) {
                createRoute.setUserName(user.getUsername());
            }
            String cityId = createRoute.getAddCityid();
            String[] cityIdArray = cityId.split(",");

            for (String cityIdItem : cityIdArray) {
                City city = cityMapper.selectByPrimaryKey(Integer.valueOf(cityIdItem));
                cityNameArray.add(city.getName());
            }
            createRoute.setCityName(cityNameArray.toString().replace("[", "").replace("]", ""));

        }
        return createRoutes;
    }

    @Override
    public Boolean deleteRoute(Integer id) {
        return 1 == createRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Object getRouteFire(ArrayList<String> cityName) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : cityName) {
            Integer num = map.get(str);
            map.put(str, num == null ? 1 : num + 1);
        }
        Set set = map.entrySet();
        Iterator it01 = map.keySet().iterator();
        Object key = new Object();
        while (it01.hasNext()) {
            key = it01.next();
            System.out.println("单词 " + key + " 出现次数 : " + map.get(key));
        }
        return key;
    }

    @Override
    public List<CreateRoute> getRoutes() {

        CreateRouteExample createRouteExample = new CreateRouteExample();
        CreateRouteExample.Criteria criteria = createRouteExample.createCriteria();
        List<CreateRoute> createRoutes = createRouteMapper.selectByExample(createRouteExample);

        return createRoutes;
    }
}
