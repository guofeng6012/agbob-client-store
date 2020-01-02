package com.agbob.client.common;

import com.agbob.client.dto.OrderDto;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class BaseCover<T> {

    private int code;

    private String message;

    private String data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
