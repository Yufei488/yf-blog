package com.yufei.enums;

import com.yufei.utils.ConstantCode;

/**
 * 请求结果枚举
 */
public enum ResultEnum {
    SUCCESS(ConstantCode.SuccessCode.SUCCESS, "请求成功" ),
    WARN(ConstantCode.SuccessCode.WARN, "请求警告" ),
    ERROR(ConstantCode.SuccessCode.ERROR, "请求失败" );

    private String code;
    private String message;


    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
