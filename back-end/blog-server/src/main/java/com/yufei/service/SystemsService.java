package com.yufei.service;

import com.yufei.entity.Systems;
import com.yufei.vo.PageParam;
import com.yufei.vo.SystemsVo;

import java.util.List;
import java.util.Map;

/**
 * 系统表(Systems)表服务接口
 *
 * @author makejava
 * @since 2020-04-02 20:23:30
 */
public interface SystemsService {
    List<Systems> querySystemList(SystemsVo systemsVo, PageParam pageParam);
}