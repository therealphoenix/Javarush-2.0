package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        int x = 365, x1 = 366;
        if((year % 400) == 0 && (year % 4) == 0) {
            System.out.println("количество дней в году: " + x1);
        }
        else if((year % 4) != 0 || year % 100 == 0)
            System.out.println("количество дней в году: " + x);
        else if((year % 4) == 0)
            System.out.println("количество дней в году: " + x1);
    }
}