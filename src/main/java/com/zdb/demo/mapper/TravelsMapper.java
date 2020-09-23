package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Travels;
import com.zdb.demo.entity.TravelsExample;

import java.util.List;

public interface TravelsMapper {
    /**
     *  根据指定的条件获取数据库记录数,travels
     *
     * @param example
     */
    int countByExample(TravelsExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,travels
     *
     * @param example
     */
    int deleteByExample(TravelsExample example);

    /**
     *  根据主键删除数据库的记录,travels
     *
     * @param answerId
     */
    int deleteByPrimaryKey(Integer answerId);

    /**
     *  新写入数据库记录,travels
     *
     * @param record
     */
    int insert(Travels record);

    /**
     *  动态字段,写入数据库记录,travels
     *
     * @param record
     */
    int insertSelective(Travels record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,travels
     *
     * @param example
     */
    List<Travels> selectByExample(TravelsExample example);

    /**
     *  根据指定主键获取一条数据库记录,travels
     *
     * @param answerId
     */
    Travels selectByPrimaryKey(Integer answerId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,travels
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Travels record, @Param("example") TravelsExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,travels
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Travels record, @Param("example") TravelsExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,travels
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Travels record);

    /**
     *  根据主键来更新符合条件的数据库记录,travels
     *
     * @param record
     */
    int updateByPrimaryKey(Travels record);
}