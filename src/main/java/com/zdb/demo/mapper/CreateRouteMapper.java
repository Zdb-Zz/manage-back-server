package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.CreateRoute;
import com.zdb.demo.entity.CreateRouteExample;

import java.util.List;

public interface CreateRouteMapper {
    /**
     *  根据指定的条件获取数据库记录数,create_route
     *
     * @param example
     */
    int countByExample(CreateRouteExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,create_route
     *
     * @param example
     */
    int deleteByExample(CreateRouteExample example);

    /**
     *  根据主键删除数据库的记录,create_route
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,create_route
     *
     * @param record
     */
    int insert(CreateRoute record);

    /**
     *  动态字段,写入数据库记录,create_route
     *
     * @param record
     */
    int insertSelective(CreateRoute record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,create_route
     *
     * @param example
     */
    List<CreateRoute> selectByExample(CreateRouteExample example);

    /**
     *  根据指定主键获取一条数据库记录,create_route
     *
     * @param id
     */
    CreateRoute selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,create_route
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") CreateRoute record, @Param("example") CreateRouteExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,create_route
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") CreateRoute record, @Param("example") CreateRouteExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,create_route
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CreateRoute record);

    /**
     *  根据主键来更新符合条件的数据库记录,create_route
     *
     * @param record
     */
    int updateByPrimaryKey(CreateRoute record);
}