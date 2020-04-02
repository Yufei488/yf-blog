package com.yufei.vo;
import java.util.Date;
import java.io.Serializable;
import com.yufei.vo.ParamsVo;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 系统表(Systems)实体类
 *
 * @author makejava
 * @since 2020-04-02 20:28:20
 */
public class SystemsVo implements Serializable,ParamsVo {
    private static final long serialVersionUID = 462432157977152197L;
    /**
    * 系统id
    */
    private Integer sys0100;
    /**
    * 系统名称
    */
    private String sys0101;
    /**
    * 系统介绍
    */
    private String sys0102;
    /**
    * 创建时间
    */
    private Date sys0103;
    /**
    * 是否可用
    */
    private String usable;
    /**
    * 最后操作时间
    */
    private Date lastopt;

        
    public Integer getSys0100() {
        return sys0100;
    }

    public void setSys0100(Integer sys0100) {
        this.sys0100 = sys0100;
    }
        
    public String getSys0101() {
        return sys0101;
    }

    public void setSys0101(String sys0101) {
        this.sys0101 = sys0101;
    }
        
    public String getSys0102() {
        return sys0102;
    }

    public void setSys0102(String sys0102) {
        this.sys0102 = sys0102;
    }
        
    public Date getSys0103() {
        return sys0103;
    }

    public void setSys0103(Date sys0103) {
        this.sys0103 = sys0103;
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