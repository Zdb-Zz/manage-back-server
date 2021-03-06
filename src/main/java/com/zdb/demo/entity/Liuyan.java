package com.zdb.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Liuyan
 * 数据库表：liuyan
 */
public class Liuyan implements Serializable {

    /**
     * 
     * 表字段 : liuyan.ly_id
     */
    private Integer lyId;

    /**
     * 
     * 表字段 : liuyan.ly_name
     */
    private String lyName;

    /**
     * 
     * 表字段 : liuyan.ly_date
     */
    private Date lyDate;

    /**
     * 
     * 表字段 : liuyan.ly_content
     */
    private String lyContent;

    /**
     * 
     * 表字段 : liuyan.ly_for_name
     */
    private String lyForName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table liuyan
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:liuyan.ly_id
     *
     * @return liuyan.ly_id, 
     */
    public Integer getLyId() {
        return lyId;
    }

    /**
     * 设置  字段:liuyan.ly_id
     *
     * @param lyId the value for liuyan.ly_id, 
     */
    public void setLyId(Integer lyId) {
        this.lyId = lyId;
    }

    /**
     * 获取  字段:liuyan.ly_name
     *
     * @return liuyan.ly_name, 
     */
    public String getLyName() {
        return lyName;
    }

    /**
     * 设置  字段:liuyan.ly_name
     *
     * @param lyName the value for liuyan.ly_name, 
     */
    public void setLyName(String lyName) {
        this.lyName = lyName == null ? null : lyName.trim();
    }

    /**
     * 获取  字段:liuyan.ly_date
     *
     * @return liuyan.ly_date, 
     */
    public Date getLyDate() {
        return lyDate;
    }

    /**
     * 设置  字段:liuyan.ly_date
     *
     * @param lyDate the value for liuyan.ly_date, 
     */
    public void setLyDate(Date lyDate) {
        this.lyDate = lyDate;
    }

    /**
     * 获取  字段:liuyan.ly_content
     *
     * @return liuyan.ly_content, 
     */
    public String getLyContent() {
        return lyContent;
    }

    /**
     * 设置  字段:liuyan.ly_content
     *
     * @param lyContent the value for liuyan.ly_content, 
     */
    public void setLyContent(String lyContent) {
        this.lyContent = lyContent == null ? null : lyContent.trim();
    }

    /**
     * 获取  字段:liuyan.ly_for_name
     *
     * @return liuyan.ly_for_name, 
     */
    public String getLyForName() {
        return lyForName;
    }

    /**
     * 设置  字段:liuyan.ly_for_name
     *
     * @param lyForName the value for liuyan.ly_for_name, 
     */
    public void setLyForName(String lyForName) {
        this.lyForName = lyForName == null ? null : lyForName.trim();
    }
}