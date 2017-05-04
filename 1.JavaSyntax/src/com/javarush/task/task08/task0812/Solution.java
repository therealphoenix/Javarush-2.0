package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int max = 1;
        int longest = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 1; i <= list.size() - 1; i++) {
            if (list.get(i - 1) == list.get(i)) {
                max++;
                if (max> longest) {
                    longest = max;
                }
            } else {
                max = 1;
            }
        }
        System.out.println(longest);
    }
}
