package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(100);
            System.out.println(i);
        }

        System.out.println("Бум!");
    }
}
