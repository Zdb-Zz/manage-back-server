package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Liuyan;
import com.zdb.demo.entity.LiuyanExample;

import java.util.List;

public interface LiuyanMapper {
    /**
     *  根据指定的条件获取数据库记录数,liuyan
     *
     * @param example
     */
    int countByExample(LiuyanExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,liuyan
     *
     * @param example
     */
    int deleteByExample(LiuyanExample example);

    /**
     *  根据主键删除数据库的记录,liuyan
     *
     * @param lyId
     */
    int deleteByPrimaryKey(Integer lyId);

    /**
     *  新写入数据库记录,liuyan
     *
     * @param record
     */
    int insert(Liuyan record);

    /**
     *  动态字段,写入数据库记录,liuyan
     *
     * @param record
     */
    int insertSelective(Liuyan record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,liuyan
     *
     * @param example
     */
    List<Liuyan> selectByExample(LiuyanExample example);

    /**
     *  根据指定主键获取一条数据库记录,liuyan
     *
     * @param lyId
     */
    Liuyan selectByPrimaryKey(Integer lyId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,liuyan
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Liuyan record, @Param("example") LiuyanExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,liuyan
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Liuyan record, @Param("example") LiuyanExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,liuyan
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Liuyan record);

    /**
     *  根据主键来更新符合条件的数据库记录,liuyan
     *
     * @param record
     */
    int updateByPrimaryKey(Liuyan record);
}