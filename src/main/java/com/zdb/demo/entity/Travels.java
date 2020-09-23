package com.zdb.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Travels
 * 数据库表：travels
 */
public class Travels implements Serializable {

    /**
     * 
     * 表字段 : travels.answer_id
     */
    private Integer answerId;

    /**
     * 文字
     * 表字段 : travels.words
     */
    private String words;

    /**
     * 图片
     * 表字段 : travels.showUserImg
     */
    private String showuserimg;

    /**
     * 用户Id
     * 表字段 : travels.user_id
     */
    private Integer userId;

    /**
     * 创建时间
     * 表字段 : travels.createTime
     */
    private Date createtime;

    /**
     * 定位
     * 表字段 : travels.location
     */
    private String location;

    /**
     * 点赞数
     * 表字段 : travels.prase_count
     */
    private Integer praseCount;

    /**
     * @用户
     * 表字段 : travels.atName
     */
    private String atname;

    /**
     * 话题
     * 表字段 : travels.topicWords
     */
    private String topicwords;

    /**
     * 用户名
     */
    private String userName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table travels
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:travels.answer_id
     *
     * @return travels.answer_id, 
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置  字段:travels.answer_id
     *
     * @param answerId the value for travels.answer_id, 
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取 文字 字段:travels.words
     *
     * @return travels.words, 文字
     */
    public String getWords() {
        return words;
    }

    /**
     * 设置 文字 字段:travels.words
     *
     * @param words the value for travels.words, 文字
     */
    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
    }

    /**
     * 获取 图片 字段:travels.showUserImg
     *
     * @return travels.showUserImg, 图片
     */
    public String getShowuserimg() {
        return showuserimg;
    }

    /**
     * 设置 图片 字段:travels.showUserImg
     *
     * @param showuserimg the value for travels.showUserImg, 图片
     */
    public void setShowuserimg(String showuserimg) {
        this.showuserimg = showuserimg == null ? null : showuserimg.trim();
    }

    /**
     * 获取 用户Id 字段:travels.user_id
     *
     * @return travels.user_id, 用户Id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 用户Id 字段:travels.user_id
     *
     * @param userId the value for travels.user_id, 用户Id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 创建时间 字段:travels.createTime
     *
     * @return travels.createTime, 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置 创建时间 字段:travels.createTime
     *
     * @param createtime the value for travels.createTime, 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取 定位 字段:travels.location
     *
     * @return travels.location, 定位
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置 定位 字段:travels.location
     *
     * @param location the value for travels.location, 定位
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取 点赞数 字段:travels.prase_count
     *
     * @return travels.prase_count, 点赞数
     */
    public Integer getPraseCount() {
        return praseCount;
    }

    /**
     * 设置 点赞数 字段:travels.prase_count
     *
     * @param praseCount the value for travels.prase_count, 点赞数
     */
    public void setPraseCount(Integer praseCount) {
        this.praseCount = praseCount;
    }

    /**
     * 获取 @用户 字段:travels.atName
     *
     * @return travels.atName, @用户
     */
    public String getAtname() {
        return atname;
    }

    /**
     * 设置 @用户 字段:travels.atName
     *
     * @param atname the value for travels.atName, @用户
     */
    public void setAtname(String atname) {
        this.atname = atname == null ? null : atname.trim();
    }

    /**
     * 获取 话题 字段:travels.topicWords
     *
     * @return travels.topicWords, 话题
     */
    public String getTopicwords() {
        return topicwords;
    }

    /**
     * 设置 话题 字段:travels.topicWords
     *
     * @param topicwords the value for travels.topicWords, 话题
     */
    public void setTopicwords(String topicwords) {
        this.topicwords = topicwords == null ? null : topicwords.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}