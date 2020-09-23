package com.zdb.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * CommentReply
 * 数据库表：comment_reply
 */
public class CommentReply implements Serializable {

    /**
     * 
     * 表字段 : comment_reply.comment_id
     */
    private Integer commentId;

    /**
     * 
     * 表字段 : comment_reply.user_id
     */
    private Integer userId;

    /**
     * 
     * 表字段 : comment_reply.replyuser_id
     */
    private Integer replyuserId;

    /**
     * 
     * 表字段 : comment_reply.content
     */
    private String content;

    /**
     * 
     * 表字段 : comment_reply.prase_count
     */
    private Integer praseCount;

    /**
     * 
     * 表字段 : comment_reply.createTime
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment_reply
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:comment_reply.comment_id
     *
     * @return comment_reply.comment_id, 
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 设置  字段:comment_reply.comment_id
     *
     * @param commentId the value for comment_reply.comment_id, 
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取  字段:comment_reply.user_id
     *
     * @return comment_reply.user_id, 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置  字段:comment_reply.user_id
     *
     * @param userId the value for comment_reply.user_id, 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:comment_reply.replyuser_id
     *
     * @return comment_reply.replyuser_id, 
     */
    public Integer getReplyuserId() {
        return replyuserId;
    }

    /**
     * 设置  字段:comment_reply.replyuser_id
     *
     * @param replyuserId the value for comment_reply.replyuser_id, 
     */
    public void setReplyuserId(Integer replyuserId) {
        this.replyuserId = replyuserId;
    }

    /**
     * 获取  字段:comment_reply.content
     *
     * @return comment_reply.content, 
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置  字段:comment_reply.content
     *
     * @param content the value for comment_reply.content, 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取  字段:comment_reply.prase_count
     *
     * @return comment_reply.prase_count, 
     */
    public Integer getPraseCount() {
        return praseCount;
    }

    /**
     * 设置  字段:comment_reply.prase_count
     *
     * @param praseCount the value for comment_reply.prase_count, 
     */
    public void setPraseCount(Integer praseCount) {
        this.praseCount = praseCount;
    }

    /**
     * 获取  字段:comment_reply.createTime
     *
     * @return comment_reply.createTime, 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置  字段:comment_reply.createTime
     *
     * @param createtime the value for comment_reply.createTime, 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}