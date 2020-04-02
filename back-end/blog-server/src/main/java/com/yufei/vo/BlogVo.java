package com.yufei.vo;
import java.util.Date;
import java.io.Serializable;
import com.yufei.vo.ParamsVo;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 博客信息表(Blog)实体类
 *
 * @author makejava
 * @since 2020-04-02 21:51:26
 */
public class BlogVo implements Serializable,ParamsVo {
    private static final long serialVersionUID = -54331710532877409L;
    /**
    * 博客id
    */
    private Integer b0100;
    /**
    * 用户id
    */
    private Integer u0100;
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
    private Long b0105;
    /**
    * 回复数
    */
    private Long b0106;
    /**
    * 浏览量
    */
    private Long b0107;
    /**
    * 是否可用
    */
    private String usable;
    /**
    * 最后操作时间
    */
    private Date lastopt;

        
    public Integer getB0100() {
        return b0100;
    }

    public void setB0100(Integer b0100) {
        this.b0100 = b0100;
    }
        
    public Integer getU0100() {
        return u0100;
    }

    public void setU0100(Integer u0100) {
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
        
    public Long getB0105() {
        return b0105;
    }

    public void setB0105(Long b0105) {
        this.b0105 = b0105;
    }
        
    public Long getB0106() {
        return b0106;
    }

    public void setB0106(Long b0106) {
        this.b0106 = b0106;
    }
        
    public Long getB0107() {
        return b0107;
    }

    public void setB0107(Long b0107) {
        this.b0107 = b0107;
    }
        
    public String getUsable() {
        return usable;
    }

    public void setUsable(String usable) {
        this.usable = usable;
    }
        
    public Date getLastopt() {
        return lastopt;
    }

    public void setLastopt(Date lastopt) {
        this.lastopt = lastopt;
    }

}