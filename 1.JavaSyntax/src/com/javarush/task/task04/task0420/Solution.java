package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] array = new int[3];
       int temp = 0;
       for(int i = 0; i < array.length; i++) {
           array[i] = Integer.parseInt(reader.readLine());
       }
       for(int i = 0; i < array.length; i++) {
           for (int j = i; j > 0; j--) {
               if (array[j] > array[j - 1]) {
                   temp = array[j];
                   array[j] = array[j - 1];
                   array[j - 1] = temp;
               }
           }
       }
        for(int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
    }
}
