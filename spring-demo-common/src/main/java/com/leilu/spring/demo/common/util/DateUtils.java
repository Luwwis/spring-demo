package com.leilu.spring.demo.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leilu on 2019/8/13.
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.format(date);
    }
    public static Date stringToDate(String dateStr,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        String dateStr="20180101";
        Date date=DateUtils.stringToDate(dateStr,"yyyyMMdd");
        System.out.println();
    }
}
