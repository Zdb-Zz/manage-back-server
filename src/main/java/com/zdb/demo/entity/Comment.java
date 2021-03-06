package com.zdb.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Comment
 * 数据库表：comment
 */
public class Comment implements Serializable {

    /**
     * 
     * 表字段 : comment.comment_id
     */
    private Integer commentId;

    /**
     * 
     * 表字段 : comment.answer_id
     */
    private Integer answerId;

    /**
     * 
     * 表字段 : comment.user_id
     */
    private Integer userId;

    /**
     * 
     * 表字段 : comment.prase_count
     */
    private Integer praseCount;

    /**
     * 
     * 表字段 : comment.createTime
     */
    private Date createtime;

    /**
     * 
     * 表字段 : comment.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:comment.comment_id
     *
     * @return comment.comment_id, 
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 设置  字段:comment.comment_id
     *
     * @param commentId the value for comment.comment_id, 
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取  字段:comment.answer_id
     *
     * @return comment.answer_id, 
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置  字段:comment.answer_id
     *
     * @param answerId the value for comment.answer_id, 
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取  字段:comment.user_id
     *
     * @return comment.user_id, 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置  字段:comment.user_id
     *
     * @param userId the value for comment.user_id, 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:comment.prase_count
     *
     * @return comment.prase_count, 
     */
    public Integer getPraseCount() {
        return praseCount;
    }

    /**
     * 设置  字段:comment.prase_count
     *
     * @param praseCount the value for comment.prase_count, 
     */
    public void setPraseCount(Integer praseCount) {
        this.praseCount = praseCount;
    }

    /**
     * 获取  字段:comment.createTime
     *
     * @return comment.createTime, 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置  字段:comment.createTime
     *
     * @param createtime the value for comment.createTime, 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取  字段:comment.content
     *
     * @return comment.content, 
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置  字段:comment.content
     *
     * @param content the value for comment.content, 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}