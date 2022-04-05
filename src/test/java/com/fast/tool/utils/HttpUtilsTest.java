package com.fast.tool.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lfh
 * @version 1.0
 * @date 2022/4/5 23:10
 */
@SpringBootTest
public class HttpUtilsTest {
   @Test
    void doGetTest(){
       String url="https://www.baidu.com/";
       HttpUtils.doGet(url);
   }
}
