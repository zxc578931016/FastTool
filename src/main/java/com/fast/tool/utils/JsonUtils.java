package com.fast.tool.utils;


import com.fast.tool.pojo.BaseMapper;
import com.fast.tool.utils.impl.ParameterizedTypeImpl;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonUtils {




    public static <T> BaseMapper<T> fromJsonObject(String reader, Class<T> clazz) {
        Gson gson = new Gson();
        Type type = new ParameterizedTypeImpl(BaseMapper.class, new Class[]{clazz});
        return gson.fromJson(reader, type);
    }
}
