package com.zdb.demo.service;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.CreateRoute;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public interface CreateRouteService {
    Page<CreateRoute> getRouteList(Integer pageIndex,Integer pageSize,String chooseCity,String username);

    Boolean deleteRoute(Integer id);

    Object getRouteFire(ArrayList<String> cityName);

    List<CreateRoute> getRoutes();
}
