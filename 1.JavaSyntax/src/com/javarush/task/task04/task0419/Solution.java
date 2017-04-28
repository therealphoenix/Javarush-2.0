package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max;
        int[] arrayOfNumbers = new int[4];
        for(int i=0; i <= 3; i++)
            arrayOfNumbers[i] = Integer.parseInt(reader.readLine());
        max = arrayOfNumbers[0];
        for(int i = 1; i <= 3; i++){
            if(arrayOfNumbers[i] > max) max = arrayOfNumbers[i];
        }
        System.out.println(max);
    }
}
