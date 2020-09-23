package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Sign;
import com.zdb.demo.entity.SignExample;

import java.util.List;

public interface SignMapper {
    /**
     *  根据指定的条件获取数据库记录数,sign
     *
     * @param example
     */
    int countByExample(SignExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,sign
     *
     * @param example
     */
    int deleteByExample(SignExample example);

    /**
     *  根据主键删除数据库的记录,sign
     *
     * @param signId
     */
    int deleteByPrimaryKey(Integer signId);

    /**
     *  新写入数据库记录,sign
     *
     * @param record
     */
    int insert(Sign record);

    /**
     *  动态字段,写入数据库记录,sign
     *
     * @param record
     */
    int insertSelective(Sign record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,sign
     *
     * @param example
     */
    List<Sign> selectByExample(SignExample example);

    /**
     *  根据指定主键获取一条数据库记录,sign
     *
     * @param signId
     */
    Sign selectByPrimaryKey(Integer signId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,sign
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Sign record, @Param("example") SignExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,sign
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Sign record, @Param("example") SignExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,sign
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Sign record);

    /**
     *  根据主键来更新符合条件的数据库记录,sign
     *
     * @param record
     */
    int updateByPrimaryKey(Sign record);
}