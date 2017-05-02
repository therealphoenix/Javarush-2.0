package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] houses = new int[15];
        int odd = 0;
        int even = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < houses.length; i++){
            houses[i] = Integer.parseInt(reader.readLine());
            if(houses[i] % 2 == 0){
                odd = odd + houses[i];
            }
            else {
                even = even + houses[i];
            }
        }
        System.out.println((even > odd) ? "В домах с четными номерами проживает больше жителей." :
                "В домах с нечетными номерами проживает больше жителей.");
    }
}
