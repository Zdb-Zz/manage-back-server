package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Clock;
import com.zdb.demo.entity.ClockExample;

import java.util.List;

public interface ClockMapper {
    /**
     *  根据指定的条件获取数据库记录数,clock
     *
     * @param example
     */
    int countByExample(ClockExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,clock
     *
     * @param example
     */
    int deleteByExample(ClockExample example);

    /**
     *  根据主键删除数据库的记录,clock
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,clock
     *
     * @param record
     */
    int insert(Clock record);

    /**
     *  动态字段,写入数据库记录,clock
     *
     * @param record
     */
    int insertSelective(Clock record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,clock
     *
     * @param example
     */
    List<Clock> selectByExample(ClockExample example);

    /**
     *  根据指定主键获取一条数据库记录,clock
     *
     * @param id
     */
    Clock selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,clock
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Clock record, @Param("example") ClockExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,clock
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Clock record, @Param("example") ClockExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,clock
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Clock record);

    /**
     *  根据主键来更新符合条件的数据库记录,clock
     *
     * @param record
     */
    int updateByPrimaryKey(Clock record);
}