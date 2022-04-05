package com.fast.tool.poro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MapperUtil<T> {


    private int code;
    private String message;
    public T data;

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


    @JsonIgnoreProperties(ignoreUnknown = true)
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }





}
