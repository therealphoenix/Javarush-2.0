package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       char [] array = reader.readLine().toCharArray();
       for(Character c : array){
           int number = Character.getNumericValue(c);
           if(number % 2 == 0){
               even++;
           }
           else{
               odd++;
           }
       }
        System.out.println("Even: " + even + " Odd: " +odd);
    }
}
