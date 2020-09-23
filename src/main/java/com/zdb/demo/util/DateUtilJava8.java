package com.zdb.demo.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * java8版本的时间工具类
 *
 * @author LQ
 * @date 2018/7/23
 */
public class DateUtilJava8 {

    private DateUtilJava8() {}

    /**
     * yyyy-MM-dd
     */
    public static final String PATTERN1 = "yyyy-MM-dd";
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String PATTERN2 = "yyyy-MM-dd HH:mm:ss";
    /**
     * yyyy.MM.dd
     */
    public static final String PATTERN3 = "yyyy.MM.dd";
    /**
     * yyyy.MM.dd HH:mm:ss
     */
    public static final String PATTERN4 = "yyyy.MM.dd HH:mm:ss";
    /**
     * yyyy年MM月dd日
     */
    public static final String PATTERN5 = "yyyy年MM月dd日";
    /**
     * HH:mm
     */
    public static final String PATTERN6 = "HH:mm";
    /**
     * yyyy年MM月
     */
    public static final String PATTERN7 = "yyyy年MM月";
    /**
     * 获取当前时间
     *
     * @return Date
     */
    public static Date getNow() {
        return Date .from(Instant.now());
    }

    /**
     * Date -> String
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        if (null == date) {
            return "";
        }
        return DateTimeFormatter.ofPattern(pattern)
                .format(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
    }
    /**
     * Date -> LocalDateTime
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
    /**
     * Date -> LocalDate
     * @param date
     * @return
     */
    public static LocalDate dateToLocalDate(Date date) {
        if (null == date) {
            return null;
        }
        return dateToLocalDateTime(date).toLocalDate();
    }
    /**
     * Date -> LocalTime
     * @param date
     * @return
     */
    public static LocalTime dateToLocalTime(Date date) {
        if (null == date) {
            return null;
        }
        return dateToLocalDateTime(date).toLocalTime();
    }
    /**
     * LocalDateTime -> String
     * @param localDateTime
     * @param pattern
     * @return
     */
    public static String localDateTimeToString(LocalDateTime localDateTime, String pattern) {
        return DateTimeFormatter.ofPattern(pattern).format(localDateTime);
    }
    /**
     * LocalDate -> String
     * @param localDate
     * @param pattern
     * @return
     */
    public static String localDateToString(LocalDate localDate, String pattern) {
        return DateTimeFormatter.ofPattern(pattern).format(localDate);
    }

    /**
     * LocalTime -> String
     * @param localTime
     * @param pattern
     * @return
     */
    public static String localTimeToString(LocalTime localTime, String pattern) {
        return DateTimeFormatter.ofPattern(pattern).format(localTime);
    }
    /**
     * 获取指定日期的开头
     * @param date
     * @return
     */
    public static Date getDateStart(Date date) {
        if (null == date) {
            return null;
        }
        return Date.from(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取指定日期的下一天的开始
     * @param date
     * @return
     */
    public static Date getDateFinish(Date date) {
        if (null == date) {
            return null;
        }
        return Date.from(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).plusDays(1).toInstant());
    }

    /**
     * 计算给定时间到当前时间的月份数
     *
     * @param date
     * @return
     */
    public static Long dateToNowMonthNum(Date date) {
        if (null == date) {
            return 0L;
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = dateToLocalDateTime(date);

        return Math.abs(now.until(dateTime, ChronoUnit.MONTHS));
    }

    /**
     * String数据转换为Date
     *
     * @param dateString
     * @return
     */
    public static Date StringToDate(String dateString) {
        DateFormat sdf = new SimpleDateFormat(PATTERN2);
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 计算两个时间的小时差
     * @param startTime
     * @param endTime
     * @return
     */
    public static Long dateDiff(Date startTime, Date endTime) {
        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        long nh = 1000 * 60 * 60;//一小时的毫秒数
        //获得两个时间的毫秒时间差异
        Long diff = endTime.getTime() - startTime.getTime();
        long hours = diff % nd / nh;//计算差多少小时
        return hours;
    }
    // 获取本月是哪一月
    public static int getNowMonth() {
        Date date = new Date();
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        return gc.get(Calendar.MONTH) + 1;
    }

    // 获取今年是哪一年
    public static Integer getNowYear() {
        Date date = new Date();
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        return Integer.valueOf(gc.get(Calendar.YEAR));
    }
    // 获取上X月的开始时间
    public static Date getBeginDayOfLastMonth(Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth() - month, 1);
        return getDayStartTime(calendar.getTime());
    }

    // 获取上X-1月的结束时间
    public static Date getEndDayOfLastMonth(Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth() - month, 1);
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(getNowYear(), getNowMonth() - month, day);
        return getDayEndTime(calendar.getTime());
    }

    /**
     * 获取某年第一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearFirst(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    /**
     * 获取某年最后一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();

        return currYearLast;
    }

    /**
     * 获取 某个时间为起点  n个月后的 日期
     * @param date
     * @param month
     * @return
     */
    public static Date getAfterMonth(Date date,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //获取当前时间的n个月后的时间
        calendar.add(Calendar.MONTH,month);
        return calendar.getTime();
    }

    /**
     * 获取传入时间的当月开始时间
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date getMonthstart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date start = calendar.getTime();
        return start;
    }



    /**
     * 获取传入时间的当月结束时间
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date getMonthend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        Date end = calendar.getTime();
        return end;
    }

    public static void main(String[] args) {
        Date beginDayOfLastMonth = getBeginDayOfLastMonth(12);
        System.out.println(beginDayOfLastMonth);

        Date afterMonth = getAfterMonth(new Date(), -2);
        System.out.println(afterMonth);

        Date monthstart = getMonthstart(afterMonth);
        System.out.println(monthstart);
        Date monthend = getMonthend(afterMonth);
        System.out.println(monthend);
    }

    // 获取某个日期的开始时间
    public static Timestamp getDayStartTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if (null != d)
            calendar.setTime(d);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }
    // 获取某个日期的结束时间
    public static Timestamp getDayEndTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if (null != d)
            calendar.setTime(d);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 通过日期和工期，得出预计其日期
     * @param sourceDate
     * @param month
     * @return
     */
    public static Date stepMonth(Date sourceDate, int month) {
        Calendar c = Calendar.getInstance();
        c.setTime(sourceDate);
        c.add(Calendar.MONTH, month);
        return c.getTime();
    }

    /**
     * 计算天数差取绝对值
     * @param date1 date1
     * @param date2 date2
     * @return long
     */
    public static long differenceOfDay(Date date1, Date date2) {
        long oneDayMin = 24 * 3600 * 1000;
        long time1= date1.getTime();
        long time2 = date2.getTime();
        return Math.abs(time2 - time1) / oneDayMin;
    }

    public static String format(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }


}
