package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        int maximum = arr[arr.length - 1];
        int minimum = arr[0];
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
