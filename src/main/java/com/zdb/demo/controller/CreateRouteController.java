package com.zdb.demo.controller;


import com.github.pagehelper.Page;
import com.zdb.demo.entity.CreateRoute;
import com.zdb.demo.entity.User;
import com.zdb.demo.service.CreateRouteService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/route")
public class CreateRouteController {

    @Resource
    CreateRouteService createRouteService;

    /**
     * 获取路线列表
     * @param pageIndex
     * @param pageSize
     * @param chooseCity
     * @param username
     * @return
     */
    @GetMapping("/getRouteList")
    public Map<String, Object> getUserList(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                           @RequestParam(value = "chooseCity", required = false) String chooseCity,
                                           @RequestParam(value = "username", required = false) String username
    ) {
        Page<CreateRoute> createRoutes = createRouteService.getRouteList(pageIndex,pageSize,chooseCity,username);
        if (createRoutes != null && createRoutes.size() > 0) {
            return ResultUtil.listResult(createRoutes.getPageNum(), createRoutes.getPageSize(), (int) createRoutes.getTotal(), createRoutes.getResult());
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }

    /**
     * 删除路线
     * @param id
     * @return
     */
    @GetMapping("/deleteRoute")
    public Map<String, Object> deleteRoute(@RequestParam("id") Integer id) {
        Boolean isSuccess = createRouteService.deleteRoute(id);
        if (isSuccess) {
            return ResultUtil.resultSuccess("删除成功", null, null);
        } else {
            return ResultUtil.resultFail("删除失败", null, null);
        }
    }

    @GetMapping("/getRouteFire")
    public Map<String, Object> getRouteFire() {
        HashMap<String,Object> fire = new HashMap<>();
        Integer first = 0;
        Integer second = 0;
        Integer third = 0;
        List<CreateRoute> createRoutes = createRouteService.getRoutes();
        ArrayList<String> cityName = new ArrayList<>();
        for (CreateRoute createRoute : createRoutes) {
            String cityId = createRoute.getAddCityid();
            String[] cityIdArray = cityId.split(",");
            for (int i = 0; i < cityIdArray.length; i++) {
                cityName.add(cityIdArray[i]);
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : cityName) {
            Integer num = map.get(str);
            map.put(str, num == null ? 1 : num + 1);
        }
        Set set = map.entrySet();
        Iterator it01 = map.keySet().iterator();
        while (it01.hasNext()) {
            Object key = it01.next();
            if (first<map.get(key)){
                first = map.get(key);
                fire.put(key.toString(),first);
            }
        }
        System.out.println(set);
        System.out.println(fire);
        if (createRoutes != null) {
            return ResultUtil.resultSuccess("获取列表成功", null, createRoutes);
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }
}
