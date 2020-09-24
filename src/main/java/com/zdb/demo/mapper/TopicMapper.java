package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Topic;
import com.zdb.demo.entity.TopicExample;

import java.util.ArrayList;
import java.util.List;

public interface TopicMapper {
    /**
     *  根据指定的条件获取数据库记录数,topic
     *
     * @param example
     */
    int countByExample(TopicExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,topic
     *
     * @param example
     */
    int deleteByExample(TopicExample example);

    /**
     *  根据主键删除数据库的记录,topic
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,topic
     *
     * @param record
     */
    int insert(Topic record);

    /**
     *  动态字段,写入数据库记录,topic
     *
     * @param record
     */
    int insertSelective(Topic record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,topic
     *
     * @param example
     */
    List<Topic> selectByExample(TopicExample example);

    /**
     *  根据指定主键获取一条数据库记录,topic
     *
     * @param id
     */
    Topic selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,topic
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,topic
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,topic
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     *  根据主键来更新符合条件的数据库记录,topic
     *
     * @param record
     */
    int updateByPrimaryKey(Topic record);

    ArrayList<String> selectType();
}