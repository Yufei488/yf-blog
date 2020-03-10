package com.yufei.controller;

import com.yufei.utils.ConstantCode;
import com.yufei.utils.SuccessType;
import com.yufei.vo.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class BlogController extends BaseController{

    @RequestMapping("aaa")
    public ResponseData aaa() {
        ResponseData responseData = new ResponseData();
        List<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("牛逼");
        responseData.setData(list);
        return responseData;
    }
}
