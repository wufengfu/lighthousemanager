package com.edu.lighthouse.helper;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * 时间处理工具
 * @author jinzc
 * @date 2020/11/12
 */
public class MyDateUtils {

    public static String dateTimePattern = "yyyy-MM-dd HH:mm:ss";
    public static String datePattern = "yyyy-MM-dd";

    /**
     * 计算目标日期与当前时间点的相差秒数
     * @param date 目标日期 java.util.Date
     * @param hourNum
     * @return 相差秒数
     */
    public static Long epochSecondFromNow(Date date, int hourNum) {
        if (Objects.isNull(date)) {
            return null;
        }
        return asLocalDateTime(date).plusHours(hourNum).atZone(ZoneId.systemDefault()).toEpochSecond()
                - LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

    /**
     * 由生日计算年龄
     * @param birthday 生日字符串，如:1990-01-01
     * @return 当前年龄
     */
    public static Integer age(String birthday) {
        if (StringUtils.isEmpty(birthday)) {
            return -1;
        }
        long epochLength = LocalDate.now().toEpochDay() - LocalDate.parse(birthday).toEpochDay();
        int actualMax = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_YEAR);
        Long age = epochLength / actualMax;
        return age.intValue();
    }

    /**
     * LocalDate 类型转为 Date类型
     * @param localDate
     * @return Date类型结果
     */
    public static Date asDate(LocalDate localDate) {
        if (Objects.isNull(localDate)) {
            return null;
        }
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDateTime 类型转为 Date类型
     * @param localDateTime
     * @return Date类型结果
     */
    public static Date asDate(LocalDateTime localDateTime) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Date转化为LocalDate
     * @param date java.util.Date
     * @return LocalDate类型
     */
    public static LocalDate asLocalDate(Date date) {
        if (Objects.isNull(date)) {
            return null;
        }
        String theDate = defaultFormat(date).replace(" ", "T");
        return LocalDate.parse(theDate);
    }

    /**
     * Date转化为LocalDate
     * @param date java.util.Date
     * @return LocalDate类型
     */
    public static LocalDate asLocalDate(Date date,String pattern) {
        if (Objects.isNull(date)) {
            return null;
        }
        String theDate = assignFormat(date,pattern).replace(" ", "T");
        return LocalDate.parse(theDate);
    }

    /**
     * Date转化为LocalDateTime
     * @param date java.util.Date
     * @return LocalDateTime类型
     */
    public static LocalDateTime asLocalDateTime(Date date) {
        if (Objects.isNull(date)) {
            return null;
        }
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    /**
     * 字符串date，time转LocalDataTime
     * @param date 日期，如：2020-11-11
     * @param time 时间，如：09：00：00
     * @return LocalDateTime类型
     */
    public static LocalDateTime asLocalDataTime(String date, String time) {
        if (StringUtils.isAnyEmpty(date, time)) {
            return null;
        }
        String datetime = String.format("%sT%s", date, time);
        return LocalDateTime.parse(datetime);
    }

    /**
     * 字符串dateTime转LocalDataTime
     * @param dateTime 日期，如：2020-11-11 09：00：00
     * @return LocalDateTime类型
     */
    public static LocalDateTime asLocalDataTime(String dateTime) {
        if (StringUtils.isAnyEmpty(dateTime)) {
            return null;
        }
        dateTime = dateTime.replace(" ","T");
        return LocalDateTime.parse(dateTime);
    }

    /**
     * 获取未来某个时间点
     * @param date 开始时间点
     * @param timestamp 时间距离
     * @return 未来时间点
     */
    public static LocalDateTime futureDateTime(Date date, Long timestamp) {
        return MyDateUtils.asLocalDateTime(date).plusMinutes(timestamp);
    }

    /**
     * Date日期默认格式化
     * @param date java.util.Date
     * @return 默认格式化串: yyyy-MM-dd HH:mm:ss
     */
    public static String defaultFormat(Date date) {
        if (Objects.isNull(date)) {
            return null;
        }
        return new SimpleDateFormat(dateTimePattern)
                .format(date);
    }

    /**
     * Date日期默认格式化
     * @param date java.util.Date
     */
    public static String assignFormat(Date date,String pattern) {
        if (Objects.isNull(date)) {
            return null;
        }
        if (Objects.isNull(pattern)){
            pattern = dateTimePattern;
        }
        return new SimpleDateFormat(pattern)
                .format(date);
    }
}
