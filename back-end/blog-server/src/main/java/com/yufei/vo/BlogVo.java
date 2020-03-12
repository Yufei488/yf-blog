package com.yufei.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客表(Blog)实体类
 *
 * @author makejava
 * @since 2020-03-12 00:12:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogVo implements Serializable, ParamsVo {
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

}