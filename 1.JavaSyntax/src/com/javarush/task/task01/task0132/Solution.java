package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        char[] digits = Integer.toString(number).toCharArray();
        for (Character c : digits) {
            result = result + Integer.parseInt(c.toString());
        }
        return result;
    }
}