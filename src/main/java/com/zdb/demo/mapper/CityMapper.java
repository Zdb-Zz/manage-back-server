package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.City;
import com.zdb.demo.entity.CityExample;

import java.util.List;

public interface CityMapper {
    /**
     *  根据指定的条件获取数据库记录数,city
     *
     * @param example
     */
    int countByExample(CityExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,city
     *
     * @param example
     */
    int deleteByExample(CityExample example);

    /**
     *  根据主键删除数据库的记录,city
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,city
     *
     * @param record
     */
    int insert(City record);

    /**
     *  动态字段,写入数据库记录,city
     *
     * @param record
     */
    int insertSelective(City record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,city
     *
     * @param example
     */
    List<City> selectByExample(CityExample example);

    /**
     *  根据指定主键获取一条数据库记录,city
     *
     * @param id
     */
    City selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,city
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,city
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,city
     *
     * @param record
     */
    int updateByPrimaryKeySelective(City record);

    /**
     *  根据主键来更新符合条件的数据库记录,city
     *
     * @param record
     */
    int updateByPrimaryKey(City record);
}