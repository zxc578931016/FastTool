package com.fast.tool.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author lfh
 * @version 1.0
 * @date 2022/4/5 22:29
 */
@SpringBootTest
public class StringUtilsTest {
    @Test
    void isNull(){
        boolean blankStr = StringUtils.isBlank(" ");
        Assert.isTrue(blankStr,"判断空字符串为空，失败");
        boolean nullStr = StringUtils.isBlank(null);
        Assert.isTrue(nullStr,"判断空字符串为空，失败");
        boolean str = StringUtils.isBlank("a ");
        System.out.println("str = " + str);
    }

}
