package com.yufei.controller;

import com.yufei.annotation.RequiredParams;
import com.yufei.entity.Blog;
import com.yufei.enums.ResultEnum;
import com.yufei.resolver.RequiredParamsResolver;
import com.yufei.service.BlogService;
import com.yufei.utils.SuccessType;
import com.yufei.vo.BlogVo;
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
@RequestMapping("blog" )
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param blogVo 主键
     * @return 单条数据
     */
    @GetMapping("selectOne" )
    public ResponseData selectOne(@RequiredParams(value = "b0100" ) BlogVo blogVo) {
        Blog blog = this.blogService.queryById(blogVo.getB0100());
        ResponseData responseData = new ResponseData(ResultEnum.SUCCESS);
        responseData.setData(blog);
        return responseData;
    }

    @GetMapping("selectAll" )
    public ResponseData selectAll() {
        ResponseData responseData = new ResponseData(ResultEnum.SUCCESS);
        responseData.setData(this.blogService.queryAllByLimit(0, 10));
        return responseData;
    }

}