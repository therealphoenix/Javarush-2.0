package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < 10; i++){
            map.put(Integer.toString(i),Integer.toString(i));
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int result = 0;
        for(String s : map.values()){
            if(s.equals(name)){
                result++;
            }
        }
        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int result = 0;
        for(String s : map.keySet()){
            if(s.equals(lastName)){
                result++;
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
