package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
       char[] arr = line.toCharArray();
       arr[0] = Character.toUpperCase(arr[0]);
       for(int i = 0; i < arr.length - 1; i++){
           if(arr[i] == ' '){
               arr[i+1] = Character.toUpperCase(arr[i+1]);
           }
       }
       for(Character c : arr){
           System.out.print(c);
       }
    }
}
