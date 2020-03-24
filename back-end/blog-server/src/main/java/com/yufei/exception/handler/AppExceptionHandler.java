package com.yufei.exception.handler;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.yufei.enums.ResultEnum;
import com.yufei.exception.AppException;
import com.yufei.vo.ResultData;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AppExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        ResultData resultData = new ResultData(ResultEnum.ERROR);
        if (e instanceof AppException) {
            resultData.setExplain(e.getMessage());
        } else {
            resultData.setExplain("哦豁!出现了意料之外的问题");
        }
        FastJsonJsonView view = new FastJsonJsonView();
        BeanMap map = BeanMap.create(resultData);
        view.setAttributesMap(map);
        view.setContentType("application/json");
        modelAndView.setView(view);
        return modelAndView;
    }
}
