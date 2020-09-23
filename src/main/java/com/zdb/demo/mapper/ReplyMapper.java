package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Reply;
import com.zdb.demo.entity.ReplyExample;

import java.util.List;

public interface ReplyMapper {
    /**
     *  根据指定的条件获取数据库记录数,reply
     *
     * @param example
     */
    int countByExample(ReplyExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,reply
     *
     * @param example
     */
    int deleteByExample(ReplyExample example);

    /**
     *  根据主键删除数据库的记录,reply
     *
     * @param lrId
     */
    int deleteByPrimaryKey(Integer lrId);

    /**
     *  新写入数据库记录,reply
     *
     * @param record
     */
    int insert(Reply record);

    /**
     *  动态字段,写入数据库记录,reply
     *
     * @param record
     */
    int insertSelective(Reply record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,reply
     *
     * @param example
     */
    List<Reply> selectByExample(ReplyExample example);

    /**
     *  根据指定主键获取一条数据库记录,reply
     *
     * @param lrId
     */
    Reply selectByPrimaryKey(Integer lrId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,reply
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,reply
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,reply
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Reply record);

    /**
     *  根据主键来更新符合条件的数据库记录,reply
     *
     * @param record
     */
    int updateByPrimaryKey(Reply record);
}