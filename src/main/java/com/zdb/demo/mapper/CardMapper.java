package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Card;
import com.zdb.demo.entity.CardExample;

import java.util.List;

public interface CardMapper {
    /**
     *  根据指定的条件获取数据库记录数,card
     *
     * @param example
     */
    int countByExample(CardExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,card
     *
     * @param example
     */
    int deleteByExample(CardExample example);

    /**
     *  根据主键删除数据库的记录,card
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,card
     *
     * @param record
     */
    int insert(Card record);

    /**
     *  动态字段,写入数据库记录,card
     *
     * @param record
     */
    int insertSelective(Card record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,card
     *
     * @param example
     */
    List<Card> selectByExample(CardExample example);

    /**
     *  根据指定主键获取一条数据库记录,card
     *
     * @param id
     */
    Card selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,card
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,card
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,card
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Card record);

    /**
     *  根据主键来更新符合条件的数据库记录,card
     *
     * @param record
     */
    int updateByPrimaryKey(Card record);
}