package com.zdb.demo.mapper;

import org.apache.ibatis.annotations.Param;
import com.zdb.demo.entity.CommentReply;
import com.zdb.demo.entity.CommentReplyExample;

import java.util.List;

public interface CommentReplyMapper {
    /**
     *  根据指定的条件获取数据库记录数,comment_reply
     *
     * @param example
     */
    int countByExample(CommentReplyExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,comment_reply
     *
     * @param example
     */
    int deleteByExample(CommentReplyExample example);

    /**
     *  新写入数据库记录,comment_reply
     *
     * @param record
     */
    int insert(CommentReply record);

    /**
     *  动态字段,写入数据库记录,comment_reply
     *
     * @param record
     */
    int insertSelective(CommentReply record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,comment_reply
     *
     * @param example
     */
    List<CommentReply> selectByExample(CommentReplyExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,comment_reply
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") CommentReply record, @Param("example") CommentReplyExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,comment_reply
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") CommentReply record, @Param("example") CommentReplyExample example);
}