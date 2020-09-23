package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.Comment;
import com.zdb.demo.entity.CommentExample;

import java.util.List;

public interface CommentMapper {
    /**
     *  根据指定的条件获取数据库记录数,comment
     *
     * @param example
     */
    int countByExample(CommentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,comment
     *
     * @param example
     */
    int deleteByExample(CommentExample example);

    /**
     *  根据主键删除数据库的记录,comment
     *
     * @param commentId
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     *  新写入数据库记录,comment
     *
     * @param record
     */
    int insert(Comment record);

    /**
     *  动态字段,写入数据库记录,comment
     *
     * @param record
     */
    int insertSelective(Comment record);

    /**
     * ,comment
     *
     * @param example
     */
    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,comment
     *
     * @param example
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     *  根据指定主键获取一条数据库记录,comment
     *
     * @param commentId
     */
    Comment selectByPrimaryKey(Integer commentId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,comment
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * ,comment
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,comment
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,comment
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * ,comment
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(Comment record);

    /**
     *  根据主键来更新符合条件的数据库记录,comment
     *
     * @param record
     */
    int updateByPrimaryKey(Comment record);
}