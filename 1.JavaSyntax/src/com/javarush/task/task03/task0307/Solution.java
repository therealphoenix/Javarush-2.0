package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            new Zerg().name = "zerg" + i;
        }
        for (int i = 1; i < 6; i++) {
            new Protoss().name = "protoss" + i;
        }
        for (int i = 1; i < 13; i++) {
            new Terran().name = "terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
