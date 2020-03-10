package com.yufei.vo;

import java.util.List;

public class Page<T> {
    private Integer pageNumber;
    private Integer pageSize;
    private List<T> list;
}
