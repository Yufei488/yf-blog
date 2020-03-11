package com.yufei.controller;

import com.yufei.entity.Blog;
import com.yufei.service.BlogService;
import com.yufei.vo.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 博客表(Blog)表控制层
 *
 * @author makejava
 * @since 2020-03-12 00:12:14
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResponseData selectOne(Integer id) {
        ResponseData responseData = new ResponseData();
        responseData.setData(this.blogService.queryById(id));
        return responseData;
    }

    @GetMapping("selectAll")
    public ResponseData selectAll() {
        ResponseData responseData = new ResponseData();
        responseData.setData(this.blogService.queryAllByLimit(0, 10));
        return responseData;
    }

}