package com.yufei.controller;

import com.yufei.utils.SuccessType;

public interface BaseControllerInterface {
    void setData(String data, Object obj);

    void setMessage(String msg);

    void setMessage(String msg, SuccessType successType);
}
