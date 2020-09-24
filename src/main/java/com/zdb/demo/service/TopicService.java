package com.zdb.demo.service;

import com.github.pagehelper.Page;
import com.zdb.demo.entity.Topic;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface TopicService {
    Page<Topic> getRouteList(Integer pageIndex,Integer pageSize,String classification, String topicName);

    ArrayList<String> getRouteType();

    Boolean delectTopic(Integer id);
}
