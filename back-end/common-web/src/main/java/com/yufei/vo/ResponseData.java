package com.yufei.vo;

import com.yufei.enums.ResultEnum;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ResponseData {

    private String code = ResultEnum.SUCCESS.getCode();
    private String message = ResultEnum.SUCCESS.getMessage();
    private Object data;

    public ResponseData(ResultEnum result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }
}
