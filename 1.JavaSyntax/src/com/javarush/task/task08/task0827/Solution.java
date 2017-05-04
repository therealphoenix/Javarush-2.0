package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
       }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        return ((cal.get(Calendar.DAY_OF_YEAR) + 1) % 2 == 0);
    }
}
