package com.yufei.vo;

import com.yufei.enums.ResultEnum;
import lombok.*;


@Data
@AllArgsConstructor
public class ResultData {

    private String code;
    private String message;
    private String explain;
    private Object data;

    public ResultData(ResultEnum result) {
        this.code = result.getCode();
        this.message = result.getMessage();
        this.explain = result.getMessage();
    }

    public ResultData(ResultEnum result,Object data) {
        this.code = result.getCode();
        this.message = result.getMessage();
        this.explain = result.getMessage();
        this.data = data;
    }
}
