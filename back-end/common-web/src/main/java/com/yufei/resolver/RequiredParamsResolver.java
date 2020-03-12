package com.yufei.resolver;

import com.yufei.annotation.RequiredParams;
import com.yufei.vo.ParamsVo;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RequiredParamsResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        System.out.println();
        Class<?> type = methodParameter.getParameterType();
        Class<?>[] interfaces = type.getInterfaces();
        boolean flag = false;
        for (Class<?> in : interfaces) {
            flag = in.isAssignableFrom(ParamsVo.class);
        }
        System.out.println(type.isAssignableFrom(ParamsVo.class));
        return flag && methodParameter.hasParameterAnnotation(RequiredParams.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        RequiredParams requiredParams = methodParameter.getParameterAnnotation(RequiredParams.class);
        HttpServletRequest request = (HttpServletRequest) nativeWebRequest.getNativeRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        Class<?> aClass = methodParameter.getParameterType();
        Field[] declaredFields = aClass.getDeclaredFields();
        String[] strings = requiredParams.value();
        List<String> list = new ArrayList<>();
        boolean flag = true;
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
        if (!flag) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                    s.append(list.get(i));
                if (i < list.size()-1) {
                    s.append("、");
                }
            }
            throw new RuntimeException("缺少参数：" + s.toString());
        }
        return modelAndViewContainer.getModel();
    }
}
