package com.zdb.demo.controller;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.CreateRoute;
import com.zdb.demo.entity.Topic;
import com.zdb.demo.service.CityService;
import com.zdb.demo.service.TopicService;
import com.zdb.demo.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

@Slf4j
@Scope("prototype")
@RestController
@RequestMapping("/topic")
public class TopicController {
    @Resource
    TopicService topicService;

    /**
     * 获取话题列表
     * @param pageIndex
     * @param pageSize
     * @param classification
     * @param topicName
     * @return
     */
    @GetMapping("/getTopicList")
    public Map<String, Object> getTopicList(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                           @RequestParam(value = "classification", required = false) String classification,
                                           @RequestParam(value = "topicName", required = false) String topicName) {
        Page<Topic> topics = topicService.getRouteList(pageIndex, pageSize,classification,topicName);
        if (topics != null && topics.size() > 0) {
            return ResultUtil.listResult(topics.getPageNum(), topics.getPageSize(), (int) topics.getTotal(), topics.getResult());
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }

    /**
     * 获取话题类型
     * @return
     */
    @GetMapping("/getTopicType")
    public Map<String, Object> getTopicList() {
        ArrayList<String> type = topicService.getRouteType();
        ArrayList newList = getSingle(type);
        if (type != null && type.size() > 0) {
            return ResultUtil.resultSuccess("获取列表成功", null, newList);
        } else {
            return ResultUtil.resultFail("获取列表失败", null, null);
        }
    }

    /**
     * 删除话题
     * @param id
     * @return
     */
    @GetMapping("/delTopic")
    public Map<String, Object> delTopic(@RequestParam(value = "id", required = false) Integer id) {
        Boolean isSuccess = topicService.delectTopic(id);
        if (isSuccess) {
            return ResultUtil.resultSuccess("删除成功", null, isSuccess);
        } else {
            return ResultUtil.resultFail("删除失败", null, null);
        }
    }


    public static ArrayList getSingle(ArrayList list){
        ArrayList newList = new ArrayList();     //创建新集合
        Iterator it = list.iterator();        //根据传入的集合(旧集合)获取迭代器
        while(it.hasNext()){          //遍历老集合
            Object obj = it.next();       //记录每一个元素
            if(!newList.contains(obj)){      //如果新集合中不包含旧集合中的元素
                newList.add(obj);       //将元素添加
            }
        }
        return newList;
    }
}
