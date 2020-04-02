package com.yufei.dao;

import com.yufei.entity.Blog;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.yufei.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 博客信息表(Blog)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-02 21:51:26
 */
@Mapper
public interface BlogDao extends BaseMapper<Blog> {

}