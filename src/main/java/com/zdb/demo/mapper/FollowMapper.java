package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Follow;
import com.zdb.demo.entity.FollowExample;

import java.util.List;

public interface FollowMapper {
    /**
     *  根据指定的条件获取数据库记录数,follow
     *
     * @param example
     */
    int countByExample(FollowExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,follow
     *
     * @param example
     */
    int deleteByExample(FollowExample example);

    /**
     *  根据主键删除数据库的记录,follow
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,follow
     *
     * @param record
     */
    int insert(Follow record);

    /**
     *  动态字段,写入数据库记录,follow
     *
     * @param record
     */
    int insertSelective(Follow record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,follow
     *
     * @param example
     */
    List<Follow> selectByExample(FollowExample example);

    /**
     *  根据指定主键获取一条数据库记录,follow
     *
     * @param id
     */
    Follow selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,follow
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,follow
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,follow
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Follow record);

    /**
     *  根据主键来更新符合条件的数据库记录,follow
     *
     * @param record
     */
    int updateByPrimaryKey(Follow record);
}