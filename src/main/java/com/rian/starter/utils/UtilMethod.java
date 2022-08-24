package com.rian.starter.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UtilMethod {

    public static String getTimeYmdHms(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }

    public static String getYesterdayDate(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(cal.getTime());
    }

    public static String convertDateToYYMMDD(String dateTime) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = (Date)formatter.parse(dateTime);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyyMMdd");
        String finalString = newFormat.format(date);
        return finalString;
    }

    public static String safeTrim(String data){
        if (data == null){
            return "";
        }
        return data.trim();
    }
}
