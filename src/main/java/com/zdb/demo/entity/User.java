package com.zdb.demo.entity;

import java.io.Serializable;

/**
 * 
 * User
 * 数据库表：user
 */
public class User implements Serializable {

    /**
     * 
     * 表字段 : user.user_id
     */
    private Integer userId;

    /**
     * 
     * 表字段 : user.uid
     */
    private String uid;

    /**
     * 
     * 表字段 : user.username
     */
    private String username;

    /**
     * 
     * 表字段 : user.password
     */
    private String password;

    /**
     * 
     * 表字段 : user.head
     */
    private String head;

    /**
     * 
     * 表字段 : user.sex
     */
    private String sex;

    /**
     * 
     * 表字段 : user.PersonalSignature
     */
    private String personalsignature;

    /**
     * 积分
     * 表字段 : user.integral
     */
    private String integral;

    /**
     * 
     * 表字段 : user.userLv
     */
    private String userlv;

    /**
     * 
     * 表字段 : user.userBackGroundPic
     */
    private String userbackgroundpic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:user.user_id
     *
     * @return user.user_id, 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置  字段:user.user_id
     *
     * @param userId the value for user.user_id, 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:user.uid
     *
     * @return user.uid, 
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置  字段:user.uid
     *
     * @param uid the value for user.uid, 
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取  字段:user.username
     *
     * @return user.username, 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置  字段:user.username
     *
     * @param username the value for user.username, 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取  字段:user.password
     *
     * @return user.password, 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:user.password
     *
     * @param password the value for user.password, 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取  字段:user.head
     *
     * @return user.head, 
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置  字段:user.head
     *
     * @param head the value for user.head, 
     */
    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    /**
     * 获取  字段:user.sex
     *
     * @return user.sex, 
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置  字段:user.sex
     *
     * @param sex the value for user.sex, 
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取  字段:user.PersonalSignature
     *
     * @return user.PersonalSignature, 
     */
    public String getPersonalsignature() {
        return personalsignature;
    }

    /**
     * 设置  字段:user.PersonalSignature
     *
     * @param personalsignature the value for user.PersonalSignature, 
     */
    public void setPersonalsignature(String personalsignature) {
        this.personalsignature = personalsignature == null ? null : personalsignature.trim();
    }

    /**
     * 获取 积分 字段:user.integral
     *
     * @return user.integral, 积分
     */
    public String getIntegral() {
        return integral;
    }

    /**
     * 设置 积分 字段:user.integral
     *
     * @param integral the value for user.integral, 积分
     */
    public void setIntegral(String integral) {
        this.integral = integral == null ? null : integral.trim();
    }

    /**
     * 获取  字段:user.userLv
     *
     * @return user.userLv, 
     */
    public String getUserlv() {
        return userlv;
    }

    /**
     * 设置  字段:user.userLv
     *
     * @param userlv the value for user.userLv, 
     */
    public void setUserlv(String userlv) {
        this.userlv = userlv == null ? null : userlv.trim();
    }

    /**
     * 获取  字段:user.userBackGroundPic
     *
     * @return user.userBackGroundPic, 
     */
    public String getUserbackgroundpic() {
        return userbackgroundpic;
    }

    /**
     * 设置  字段:user.userBackGroundPic
     *
     * @param userbackgroundpic the value for user.userBackGroundPic, 
     */
    public void setUserbackgroundpic(String userbackgroundpic) {
        this.userbackgroundpic = userbackgroundpic == null ? null : userbackgroundpic.trim();
    }
}