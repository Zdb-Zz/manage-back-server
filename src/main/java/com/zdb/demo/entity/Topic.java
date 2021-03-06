package com.zdb.demo.entity;

import java.io.Serializable;

/**
 * 
 * Topic
 * 数据库表：topic
 */
public class Topic implements Serializable {

    /**
     * 
     * 表字段 : topic.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : topic.classification
     */
    private String classification;

    /**
     * 
     * 表字段 : topic.Icon
     */
    private String icon;

    /**
     * 
     * 表字段 : topic.name
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table topic
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:topic.id
     *
     * @return topic.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:topic.id
     *
     * @param id the value for topic.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:topic.classification
     *
     * @return topic.classification, 
     */
    public String getClassification() {
        return classification;
    }

    /**
     * 设置  字段:topic.classification
     *
     * @param classification the value for topic.classification, 
     */
    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    /**
     * 获取  字段:topic.Icon
     *
     * @return topic.Icon, 
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置  字段:topic.Icon
     *
     * @param icon the value for topic.Icon, 
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取  字段:topic.name
     *
     * @return topic.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:topic.name
     *
     * @param name the value for topic.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}