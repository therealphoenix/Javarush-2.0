package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
       Map<String,String> map = new HashMap<>();
       map.put("1","1");
       map.put("11","11");
       map.put("1","1");
       map.put("11","11");
       map.put("1","11");
       map.put("12","12");
       map.put("113","111");
       map.put("10","12");
       map.put("113","10");
       map.put("1","1");

       return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
