package com.yufei.dao;

import com.yufei.entity.Blog;
import com.yufei.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 博客表(Blog)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-23 22:34:11
 */
@Mapper
public interface BlogDao extends BaseMapper<Blog>{

    /**
     * 通过ID查询单条数据
     *
     * @param b0100 主键
     * @return 实例对象
     */
    Blog queryById(Integer b0100);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Blog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blog 实例对象
     * @return 对象列表
     */
    List<Blog> queryAll(Blog blog);

    /**
     * 新增数据
     *
     * @param blog 实例对象
     * @return 影响行数
     */
    int insert(Blog blog);

    /**
     * 修改数据
     *
     * @param blog 实例对象
     * @return 影响行数
     */
    int update(Blog blog);

    /**
     * 通过主键删除数据
     *
     * @param b0100 主键
     * @return 影响行数
     */
    int deleteById(Integer b0100);

}