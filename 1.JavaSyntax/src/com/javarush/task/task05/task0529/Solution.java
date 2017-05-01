package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String expression;
        while (true) {
            expression = reader.readLine();
            if ("сумма".equals(expression)) {
                System.out.println(sum);
                break;
            }
            sum = sum + Integer.parseInt(expression);
        }
    }
}
