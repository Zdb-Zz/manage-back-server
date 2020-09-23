package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Collection;
import com.zdb.demo.entity.CollectionExample;

import java.util.List;

public interface CollectionMapper {
    /**
     *  根据指定的条件获取数据库记录数,collection
     *
     * @param example
     */
    int countByExample(CollectionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,collection
     *
     * @param example
     */
    int deleteByExample(CollectionExample example);

    /**
     *  根据主键删除数据库的记录,collection
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,collection
     *
     * @param record
     */
    int insert(Collection record);

    /**
     *  动态字段,写入数据库记录,collection
     *
     * @param record
     */
    int insertSelective(Collection record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,collection
     *
     * @param example
     */
    List<Collection> selectByExample(CollectionExample example);

    /**
     *  根据指定主键获取一条数据库记录,collection
     *
     * @param id
     */
    Collection selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,collection
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Collection record, @Param("example") CollectionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,collection
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,collection
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Collection record);

    /**
     *  根据主键来更新符合条件的数据库记录,collection
     *
     * @param record
     */
    int updateByPrimaryKey(Collection record);
}