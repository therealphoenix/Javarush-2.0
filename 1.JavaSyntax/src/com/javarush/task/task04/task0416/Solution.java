package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());

        if (( a%5 )-2 < 1)
            System.out.println("зелёный");
        else if (Math.abs( a % 5 - 3) < 1)
            System.out.println("желтый");
        else if (Math.abs(a % 5 - 4) < 1)
            System.out.println("красный");
    }
}