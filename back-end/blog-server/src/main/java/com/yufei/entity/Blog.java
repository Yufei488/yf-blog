package com.yufei.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 博客表(Blog)实体类
 *
 * @author makejava
 * @since 2020-03-12 00:12:13
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 563249845212252955L;
    /**
    * 博客主键
    */
    private Integer b0100;
    /**
    * 发表用户
    */
    private String u0100;
    /**
    * 发表时间
    */
    private Date b0102;
    /**
    * 标题
    */
    private String b0103;
    /**
    * 内容
    */
    private String b0104;
    /**
    * 点赞数
    */
    private Integer b0105;
    /**
    * 回复数
    */
    private Integer b0106;
    /**
    * 浏览量
    */
    private Integer b0107;
    /**
    * 是否可用
    */
    private String usable;
    /**
    * 经办日期
    */
    private Date operated;


    public Integer getB0100() {
        return b0100;
    }

    public void setB0100(Integer b0100) {
        this.b0100 = b0100;
    }

    public String getU0100() {
        return u0100;
    }

    public void setU0100(String u0100) {
        this.u0100 = u0100;
    }

    public Date getB0102() {
        return b0102;
    }

    public void setB0102(Date b0102) {
        this.b0102 = b0102;
    }

    public String getB0103() {
        return b0103;
    }

    public void setB0103(String b0103) {
        this.b0103 = b0103;
    }

    public String getB0104() {
        return b0104;
    }

    public void setB0104(String b0104) {
        this.b0104 = b0104;
    }

    public Integer getB0105() {
        return b0105;
    }

    public void setB0105(Integer b0105) {
        this.b0105 = b0105;
    }

    public Integer getB0106() {
        return b0106;
    }

    public void setB0106(Integer b0106) {
        this.b0106 = b0106;
    }

    public Integer getB0107() {
        return b0107;
    }

    public void setB0107(Integer b0107) {
        this.b0107 = b0107;
    }

    public String getUsable() {
        return usable;
    }

    public void setUsable(String usable) {
        this.usable = usable;
    }

    public Date getOperated() {
        return operated;
    }

    public void setOperated(Date operated) {
        this.operated = operated;
    }

}