package com.zdb.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Card
 * 数据库表：card
 */
public class Card implements Serializable {

    /**
     * 
     * 表字段 : card.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : card.keywords
     */
    private String keywords;

    /**
     * 
     * 表字段 : card.backgroundUrl
     */
    private String backgroundurl;

    /**
     * 
     * 表字段 : card.title
     */
    private String title;

    /**
     * 
     * 表字段 : card.introduce
     */
    private String introduce;

    /**
     * 
     * 表字段 : card.dakatime
     */
    private Date dakatime;

    /**
     * 
     * 表字段 : card.dakapoeple
     */
    private String dakapoeple;

    /**
     * 著名典故
     * 表字段 : card.FamousAllusions
     */
    private String famousallusions;

    /**
     * 
     * 表字段 : card.mood
     */
    private String mood;

    /**
     * 
     * 表字段 : card.word1
     */
    private String word1;

    /**
     * 
     * 表字段 : card.img1
     */
    private String img1;

    /**
     * 
     * 表字段 : card.word2
     */
    private String word2;

    /**
     * 
     * 表字段 : card.img2
     */
    private String img2;

    /**
     * 
     * 表字段 : card.word3
     */
    private String word3;

    /**
     * 
     * 表字段 : card.img3
     */
    private String img3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:card.id
     *
     * @return card.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:card.id
     *
     * @param id the value for card.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:card.keywords
     *
     * @return card.keywords, 
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置  字段:card.keywords
     *
     * @param keywords the value for card.keywords, 
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取  字段:card.backgroundUrl
     *
     * @return card.backgroundUrl, 
     */
    public String getBackgroundurl() {
        return backgroundurl;
    }

    /**
     * 设置  字段:card.backgroundUrl
     *
     * @param backgroundurl the value for card.backgroundUrl, 
     */
    public void setBackgroundurl(String backgroundurl) {
        this.backgroundurl = backgroundurl == null ? null : backgroundurl.trim();
    }

    /**
     * 获取  字段:card.title
     *
     * @return card.title, 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置  字段:card.title
     *
     * @param title the value for card.title, 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取  字段:card.introduce
     *
     * @return card.introduce, 
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置  字段:card.introduce
     *
     * @param introduce the value for card.introduce, 
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * 获取  字段:card.dakatime
     *
     * @return card.dakatime, 
     */
    public Date getDakatime() {
        return dakatime;
    }

    /**
     * 设置  字段:card.dakatime
     *
     * @param dakatime the value for card.dakatime, 
     */
    public void setDakatime(Date dakatime) {
        this.dakatime = dakatime;
    }

    /**
     * 获取  字段:card.dakapoeple
     *
     * @return card.dakapoeple, 
     */
    public String getDakapoeple() {
        return dakapoeple;
    }

    /**
     * 设置  字段:card.dakapoeple
     *
     * @param dakapoeple the value for card.dakapoeple, 
     */
    public void setDakapoeple(String dakapoeple) {
        this.dakapoeple = dakapoeple == null ? null : dakapoeple.trim();
    }

    /**
     * 获取 著名典故 字段:card.FamousAllusions
     *
     * @return card.FamousAllusions, 著名典故
     */
    public String getFamousallusions() {
        return famousallusions;
    }

    /**
     * 设置 著名典故 字段:card.FamousAllusions
     *
     * @param famousallusions the value for card.FamousAllusions, 著名典故
     */
    public void setFamousallusions(String famousallusions) {
        this.famousallusions = famousallusions == null ? null : famousallusions.trim();
    }

    /**
     * 获取  字段:card.mood
     *
     * @return card.mood, 
     */
    public String getMood() {
        return mood;
    }

    /**
     * 设置  字段:card.mood
     *
     * @param mood the value for card.mood, 
     */
    public void setMood(String mood) {
        this.mood = mood == null ? null : mood.trim();
    }

    /**
     * 获取  字段:card.word1
     *
     * @return card.word1, 
     */
    public String getWord1() {
        return word1;
    }

    /**
     * 设置  字段:card.word1
     *
     * @param word1 the value for card.word1, 
     */
    public void setWord1(String word1) {
        this.word1 = word1 == null ? null : word1.trim();
    }

    /**
     * 获取  字段:card.img1
     *
     * @return card.img1, 
     */
    public String getImg1() {
        return img1;
    }

    /**
     * 设置  字段:card.img1
     *
     * @param img1 the value for card.img1, 
     */
    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    /**
     * 获取  字段:card.word2
     *
     * @return card.word2, 
     */
    public String getWord2() {
        return word2;
    }

    /**
     * 设置  字段:card.word2
     *
     * @param word2 the value for card.word2, 
     */
    public void setWord2(String word2) {
        this.word2 = word2 == null ? null : word2.trim();
    }

    /**
     * 获取  字段:card.img2
     *
     * @return card.img2, 
     */
    public String getImg2() {
        return img2;
    }

    /**
     * 设置  字段:card.img2
     *
     * @param img2 the value for card.img2, 
     */
    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    /**
     * 获取  字段:card.word3
     *
     * @return card.word3, 
     */
    public String getWord3() {
        return word3;
    }

    /**
     * 设置  字段:card.word3
     *
     * @param word3 the value for card.word3, 
     */
    public void setWord3(String word3) {
        this.word3 = word3 == null ? null : word3.trim();
    }

    /**
     * 获取  字段:card.img3
     *
     * @return card.img3, 
     */
    public String getImg3() {
        return img3;
    }

    /**
     * 设置  字段:card.img3
     *
     * @param img3 the value for card.img3, 
     */
    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }
}