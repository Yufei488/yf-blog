package com.yufei.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yufei.dao.SystemsDao;
import com.yufei.entity.Systems;
import com.yufei.exception.AppException;
import com.yufei.service.SystemsService;
import com.yufei.utils.ConstantCode;
import com.yufei.vo.PageParam;
import com.yufei.vo.SystemsVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 系统表(Systems)表服务实现类
 *
 * @author makejava
 * @since 2020-04-02 20:23:30
 */
@Service("systemsService")
public class SystemsServiceImpl implements SystemsService {
    @Resource
    private SystemsDao systemsDao;

    @Override
    public List<Systems> querySystemList(SystemsVo systemsVo, PageParam pageParam) {
        Example example = new Example(Systems.class);
        if (systemsVo.getSys0101()!=null){
            example.createCriteria().andLike(ConstantCode.Systems.SYS0101,"%"+systemsVo.getSys0101()+"%");
        }
        example.createCriteria().andEqualTo(ConstantCode.Systems.USABLE, ConstantCode.Num.ONE);
        List<Systems> list = systemsDao.selectByExample(example);
        PageHelper.startPage(pageParam.getPageNumber(), pageParam.getPageSize());
        return new PageInfo<>(list).getList();
    }
}