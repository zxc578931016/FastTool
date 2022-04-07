package com.fast.tool.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author moe.Li
 * @version 1.0
 * @date 2022/4/7 16:31
 */
public class TimeUtils {
    /**
     *     //现在时间
     *     //秒级时间戳
     *     //毫秒级时间戳
     *     //今天零点时间
     *     //今天零点秒级时间戳
     *     //今天零点豪秒级时间戳
     *     //秒级时间戳 转换成 字符串格式
     *     //毫秒级时间戳 转换成 字符串格式
     *     //字符串转LocalDateTime对象
     *     //LocalDateTime对象转字符串
     */

   static DateTimeFormatter nowFormatter = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
   static DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("MM");
   static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("dd");
   static DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("HH");
   static DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("mm");
   static DateTimeFormatter minuteFormatter = DateTimeFormatter.ofPattern("ss");
   static DateTimeFormatter dayZeroFormatter = DateTimeFormatter.ofPattern("yyyy:MM:dd 00:00:00");



    //现在时间
    public static String now() {
        return LocalDateTime.now().format(nowFormatter);
    }



    //秒级时间戳
    public static String secondTimeStamp() {
        long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        return String.valueOf(second);
    }


    //毫秒级时间戳
    public static String millSecondTimeStamp() {
        long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        return String.valueOf(milliSecond);
    }


    //今天零点时间
    public static String todayZeroTime() {
        return LocalDateTime.now().format(dayZeroFormatter);
    }

    //今天零点秒级时间戳
    public static String todayZeroSecondTimestamp() {
        String todayZeroTime = LocalDateTime.now().format(dayZeroFormatter);
        return String.valueOf(LocalDateTime.parse(todayZeroTime,dayZeroFormatter).toEpochSecond(ZoneOffset.of("+8")));
    }

    //今天零点豪秒级时间戳
    public static String todayZeroMilSecondTimestamp() {
        String todayZeroTime = LocalDateTime.now().format(dayZeroFormatter);
        return String.valueOf(LocalDateTime.parse(todayZeroTime,dayZeroFormatter).toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }


    //秒级时间戳 转换成 字符串格式
    public static String secondTimeStampToString(String second) {
        return LocalDateTime.ofEpochSecond(Long.parseLong(second), 0, ZoneOffset.ofHours(8)).format(nowFormatter);
    }


    //毫秒级时间戳 转换成 字符串格式
    public static String milSecondTimeStampToString(String milliSecond) {
        return Instant.ofEpochMilli(Long.parseLong(milliSecond)).atZone(ZoneOffset.ofHours(8)).toLocalDateTime().format(nowFormatter);
    }


    //字符串转LocalDateTime对象
    public static LocalDateTime stringToLocalDateTime(String time){
        return LocalDateTime.parse(time, nowFormatter);
    }

    //LocalDateTime对象转字符串
    public static String LocalDateTimeToString(LocalDateTime time){
        return time.format(nowFormatter);
    }



}
