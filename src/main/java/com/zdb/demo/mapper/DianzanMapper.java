package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Dianzan;
import com.zdb.demo.entity.DianzanExample;

import java.util.List;

public interface DianzanMapper {
    /**
     *  根据指定的条件获取数据库记录数,dianzan
     *
     * @param example
     */
    int countByExample(DianzanExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,dianzan
     *
     * @param example
     */
    int deleteByExample(DianzanExample example);

    /**
     *  根据主键删除数据库的记录,dianzan
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,dianzan
     *
     * @param record
     */
    int insert(Dianzan record);

    /**
     *  动态字段,写入数据库记录,dianzan
     *
     * @param record
     */
    int insertSelective(Dianzan record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,dianzan
     *
     * @param example
     */
    List<Dianzan> selectByExample(DianzanExample example);

    /**
     *  根据指定主键获取一条数据库记录,dianzan
     *
     * @param id
     */
    Dianzan selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,dianzan
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Dianzan record, @Param("example") DianzanExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,dianzan
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Dianzan record, @Param("example") DianzanExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,dianzan
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Dianzan record);

    /**
     *  根据主键来更新符合条件的数据库记录,dianzan
     *
     * @param record
     */
    int updateByPrimaryKey(Dianzan record);
}