package com.yufei.dao;

import com.yufei.entity.Systems;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.yufei.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统表(Systems)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-02 20:42:35
 */
@Mapper
public interface SystemsDao extends BaseMapper<Systems> {

}