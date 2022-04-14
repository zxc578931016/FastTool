package com.fast.tool.utils;

/**
 * @author lfh
 * @version 1.0
 * @date 2022/4/5 22:27
 */
public class StringUtils {
    /**
     * 判断String是否为null或""
     *
     * @param str 输入字符串
     * @return 返回校验结果
     */
    public static boolean isBlank(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}
