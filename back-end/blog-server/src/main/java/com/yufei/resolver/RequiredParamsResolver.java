package com.yufei.resolver;

import com.yufei.annotation.RequiredParams;
import com.yufei.exception.AppException;
import com.yufei.vo.ParamsVo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RequiredParamsResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        System.out.println("**********必须参数检测**********");
        Class<?> type = methodParameter.getParameterType();
        Class<?>[] interfaces = type.getInterfaces();
        boolean flag = false;
        for (Class<?> in : interfaces) {
            flag = in.isAssignableFrom(ParamsVo.class);
        }
        boolean bool = flag && methodParameter.hasParameterAnnotation(RequiredParams.class);
        if (!bool) {
            System.out.println("**********没有实现接口ParamsVo，未能检测**********");
        }
        return bool;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        RequiredParams requiredParams = methodParameter.getParameterAnnotation(RequiredParams.class);
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        System.out.println("**********开始检测[" + request.getServletPath() + "]必要参数**********");
        Map<String, String[]> parameterMap = request.getParameterMap();
        Class<?> aClass = methodParameter.getParameterType();
        Field[] declaredFields = aClass.getDeclaredFields();
        String[] strings = requiredParams.value();
        List<String> list = new ArrayList<>();
        boolean flag = true;
        // 获取必要且为空参数
        for (String string : strings) {
            for (Field field : declaredFields) {
                String name = field.getName();
                if (string.equals(name)) {
                    String[] values = parameterMap.get(name);
                    if (values == null || values.length == 0) {
                        flag = false;
                        list.add(name);
                    }
                }
            }
        }
        // 返回错误信息
        if (!flag) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                s.append(list.get(i));
                if (i < list.size() - 1) {
                    s.append("、");
                }
            }
            throw new AppException("缺少参数：" + s.toString());
        }
        // 获取javabean参数构造器
        Class<?> type = methodParameter.getParameterType();
        Constructor<?> constructor = type.getConstructor();
        if (constructor == null) {
            throw new RuntimeException("没有无参构造器");
        }
        // 构造javabean
        Object obj = constructor.newInstance();
        parameterMap.forEach((String fieldName, String[] values)-> {
            try {
                BeanUtils.setProperty(obj,fieldName,values);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
        System.out.println("**********"+"检测成功"+"**********");
        return obj;
    }
}
