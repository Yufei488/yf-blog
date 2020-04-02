package com.yufei.service.impl;

import com.yufei.entity.Blog;
import com.yufei.dao.BlogDao;
import com.yufei.service.BlogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客表(Blog)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 22:34:11
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogDao blogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param b0100 主键
     * @return 实例对象
     */
    @Override
    public Blog queryById(Integer b0100) {
        Blog blog = new Blog();
        blog.setB0100(b0100);
        return this.blogDao.selectByPrimaryKey(blog);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Blog> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    @Override
    public Blog insert(Blog blog) {
        this.blogDao.insert(blog);
        return blog;
    }

    /**
     * 修改数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    @Override
    public Blog update(Blog blog) {
//        this.blogDao.update(blog);
        return this.queryById(blog.getB0100());
    }

    /**
     * 通过主键删除数据
     *
     * @param b0100 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer b0100) {
        return true;
    }
}