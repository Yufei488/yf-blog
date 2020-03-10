package com.yufei.vo;

import com.yufei.utils.SuccessType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
    private SuccessType successType = SuccessType.SUCCESS;
    private String code = "0";
    private String message = "请求成功";
    private Object data;
}
