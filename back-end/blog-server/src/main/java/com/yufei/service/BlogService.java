package com.yufei.service;

import com.yufei.entity.Blog;
import com.yufei.dao.BlogDao;
import java.util.List;

/**
 * 博客表(Blog)表服务接口
 *
 * @author makejava
 * @since 2020-03-23 22:34:11
 */
public interface BlogService {

    /**
     * 通过ID查询单条数据
     *
     * @param b0100 主键
     * @return 实例对象
     */
    Blog queryById(Integer b0100);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Blog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    Blog insert(Blog blog);

    /**
     * 修改数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    Blog update(Blog blog);

    /**
     * 通过主键删除数据
     *
     * @param b0100 主键
     * @return 是否成功
     */
    boolean deleteById(Integer b0100);

}