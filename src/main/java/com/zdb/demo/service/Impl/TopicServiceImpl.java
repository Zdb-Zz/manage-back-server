package com.zdb.demo.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zdb.demo.entity.Topic;
import com.zdb.demo.entity.TopicExample;
import com.zdb.demo.mapper.TopicMapper;
import com.zdb.demo.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service("topicService")
public class TopicServiceImpl implements TopicService {
    @Resource
    TopicMapper topicMapper;
    @Override
    public Page<Topic> getRouteList(Integer pageIndex, Integer pageSize,String classification, String topicName) {
        TopicExample topicExample=new TopicExample();
        TopicExample.Criteria criteria = topicExample.createCriteria();
        criteria.andClassificationLike(classification);
        criteria.andNameLike(topicName);
        PageHelper.startPage(pageIndex,pageSize);
        Page<Topic> topics = (Page<Topic>) topicMapper.selectByExample(topicExample);
        return topics;
    }

    @Override
    public ArrayList<String> getRouteType() {
        ArrayList<String> type = topicMapper.selectType();
        return type;
    }

    @Override
    public Boolean delectTopic(Integer id) {
        return 1==topicMapper.deleteByPrimaryKey(id);
    }
}
