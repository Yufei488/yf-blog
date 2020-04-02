package com.yufei.controller;

import com.yufei.utils.SuccessType;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.http.HttpServletResponse;

@CrossOrigin
public class BaseController implements BaseControllerInterface {

    @Override
    public void setData(String data, Object obj) {

    }

    @Override
    public void setMessage(String msg) {

    }

    @Override
    public void setMessage(String msg, SuccessType successType) {

    }

    private Object responseData(HttpServletResponse httpServletResponse) {

//        httpServletResponse.
        return null;
    }
}
