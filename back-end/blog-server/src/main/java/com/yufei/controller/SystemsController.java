package com.yufei.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.page.PageParams;
import com.yufei.annotation.RequiredParams;
import com.yufei.entity.Systems;
import com.yufei.enums.ResultEnum;
import com.yufei.service.SystemsService;
import com.yufei.vo.PageParam;
import com.yufei.vo.ResultData;
import com.yufei.vo.SystemsVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 系统表(Systems)表控制层
 *
 * @author makejava
 * @since 2020-04-02 20:18:49
 */
@RestController
@RequestMapping("systems")
public class SystemsController extends BaseController {

    @Resource
    private SystemsService systemsService;

    @RequestMapping("querySystemList")
    public ResultData querySystemList(SystemsVo systemsVo, PageParam pageParam) {
        List<Systems> list = systemsService.querySystemList(systemsVo,pageParam);
        return new ResultData(ResultEnum.SUCCESS, list);
    }
}