package com.zdb.demo.controller;


import com.github.pagehelper.Page;
import com.zdb.demo.entity.CreateRoute;
import com.zdb.demo.service.CityService;
import com.zdb.demo.service.CreateRouteService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
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

    @Resource
    CityService cityService;
    /**
     * 获取路线列表
     *
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
        Page<CreateRoute> createRoutes = createRouteService.getRouteList(pageIndex, pageSize, chooseCity, username);
        if (createRoutes != null && createRoutes.size() > 0) {
            return ResultUtil.listResult(createRoutes.getPageNum(), createRoutes.getPageSize(), (int) createRoutes.getTotal(), createRoutes.getResult());
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }

    /**
     * 删除路线
     *
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

    /**
     * 获取选择最多的五个景点
     * @return
     */
    @GetMapping("/getRouteFire")
    public Map<String, Object> getRouteFire() {
        HashMap<String, Object> fire = new HashMap<>();
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
        Map<String, Integer> map = new TreeMap<>();
        for (String str : cityName) {
            Integer num = map.get(str);
            map.put(str, num == null ? 1 : num + 1);
        }
        Comparator<Map.Entry<String, Integer>> valCmp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return o2.getValue() - o1.getValue();  // 降序排序，如果想升序就反过来
            }
        };
        //将map转成List，map的一组key，value对应list一个存储空间
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet()); //传入maps实体
        Collections.sort(list, valCmp); // 注意此处Collections 是java.util包下面的,传入List和自定义的valCmp比较器
        HashMap<String,Object> cityFire=new HashMap<>();

        cityFire.put("firstCity",cityService.getCityNameById(Integer.valueOf(list.get(0).getKey())));
        cityFire.put("firstNum",list.get(0).getValue());
        cityFire.put("secondCity",cityService.getCityNameById(Integer.valueOf(list.get(1).getKey())));
        cityFire.put("secondNum",list.get(1).getValue());
        cityFire.put("thirdCity",cityService.getCityNameById(Integer.valueOf(list.get(2).getKey())));
        cityFire.put("thirdNum",list.get(2).getValue());
        cityFire.put("fourthCity",cityService.getCityNameById(Integer.valueOf(list.get(3).getKey())));
        cityFire.put("fourthNum",list.get(3).getValue());
        cityFire.put("fifthCity",cityService.getCityNameById(Integer.valueOf(list.get(4).getKey())));
        cityFire.put("fifthNum",list.get(4).getValue());

        if (createRoutes != null) {
            return ResultUtil.resultSuccess("获取列表成功", null, cityFire);
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }
}
