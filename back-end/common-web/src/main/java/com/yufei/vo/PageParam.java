package com.yufei.vo;

import com.yufei.utils.ConstantCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParam<T> {
    private Integer pageNumber = 1;
    private Integer pageSize = 3;
    private List<T> list;
}
