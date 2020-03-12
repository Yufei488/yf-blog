package com.yufei.enums;

/**
 * 请求结果枚举
 */
public enum ResultEnum {
    SUCCESS("1", "请求成功" ),
    WARN("-1", "请求警告" ),
    ERROR("0", "请求失败" );

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
