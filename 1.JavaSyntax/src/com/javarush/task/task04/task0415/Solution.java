package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sideA = Integer.parseInt(reader.readLine());
        int sideB = Integer.parseInt(reader.readLine());
        int sideC = Integer.parseInt(reader.readLine());

        if(sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)){
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }
}