package com.fast.tool;


import com.fast.tool.pojo.BaseMapper;
import com.fast.tool.pojo.DataBean;
import com.fast.tool.utils.JsonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToolApplication.class)
 class HttpTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();


    @Test
    void contextLoads() throws IOException {



        URL serverUrl = new URL("https://api2.filscout.com/api/v1/actor/byaddress/f028947");
        HttpURLConnection conn = (HttpURLConnection) serverUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        //必须设置false，否则会自动redirect到重定向后的地址
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        String result = getReturn(conn);



        /*BaseMapper<DataBean> one = gson.fromJson(result, new TypeToken<MapperUtil<DataBean>>(){}.getType());*/



        BaseMapper<DataBean> objectClass = JsonUtils.fromJsonObject(result,DataBean.class);
        System.out.println("状态码"+objectClass.getData().getActorCode());

    }








        //请求url获取返回的内容
    public static String getReturn(HttpURLConnection connection) throws IOException{
        StringBuffer buffer = new StringBuffer();
        //将返回的输入流转换成字符串
        try(InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);){
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            String result = buffer.toString();
            return result;
        }
    }
}