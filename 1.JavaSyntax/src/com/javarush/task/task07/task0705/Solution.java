package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < bigArr.length; i++){
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        for(int j = 0; j < bigArr.length / 2; j++){
            smallArr1[j] = bigArr[j];
            smallArr2[j] = bigArr[(bigArr.length / 2) + j];
        }
        for (Integer i : smallArr2){
            System.out.println(i);
        }
    }
}
