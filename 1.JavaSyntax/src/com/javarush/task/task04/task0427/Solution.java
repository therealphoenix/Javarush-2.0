package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number  = Integer.parseInt(reader.readLine());
         if(number <= 999 && number / 100 > 0 && number % 2 == 0){
            System.out.println("четное трехзначное число");
        }
        else if(number <= 999 && number / 100 > 0 && number % 2 != 0){
            System.out.println("нечетное трехзначное число");
        }
        else if(number <= 99 && number / 10 > 0 && number % 2 == 0){
            System.out.println("четное двузначное число");
        }
        else if(number <= 99 && number / 10 > 0 && number % 2 != 0){
            System.out.println("нечетное двузначное число");
        }
        else if(number < 10 && number >= 1 && number % 2 == 0){
            System.out.println("четное однозначное число");
        }
        else if(number < 10 && number >= 1 && number % 2 != 0){
            System.out.println("нечетное однозначное число");
        }
    }
}
