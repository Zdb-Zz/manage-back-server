package com.zdb.demo.util;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortUtil {
    private final static String SORT_ASC = "ASC";
    private final static String SORT_DESC = "DESC";

    /**
     * 集合排序
     * @param list 需排序的集合
     * @param property 元素名称
     * @param sort 排序方式
     * @param <T>
     * @return
     */
    public static <T> void sortList(List<T> list, String property, String sort) {
        Collections.sort(list, (o1, o2) -> {
            try {
                Field field1 = o1.getClass().getDeclaredField(property);
                field1.setAccessible(true);
                Integer i1 = Integer.parseInt(getNumber(field1.get(o1).toString()));

                Field field2 = o2.getClass().getDeclaredField(property);
                field2.setAccessible(true);
                Integer i2 = Integer.parseInt(getNumber(field2.get(o2).toString()));

                //降序
                if (sort.toUpperCase().equals(SORT_DESC))
                    return i2.compareTo(i1);

                //升序
                if (sort.toUpperCase().equals(SORT_ASC))
                    return i1.compareTo(i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        });
    }

    /**
     * 提取数字
     *
     * @param str
     * @return
     */
    public static String getNumber(String str) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
}