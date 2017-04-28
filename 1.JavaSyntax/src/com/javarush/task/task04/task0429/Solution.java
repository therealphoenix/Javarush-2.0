package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++ ){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int countPos = 0;
        int countNeg = 0;
        for(Integer  i : array){
            if(i > 0){
                countPos++;
            }
            if(i < 0){
                countNeg++;
            }
        }
        System.out.println("количество отрицательных чисел: " +countNeg);
        System.out.println("количество положительных чисел: " +countPos);
    }
    }

