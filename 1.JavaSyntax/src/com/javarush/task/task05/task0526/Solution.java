package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/


public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Adam", 43, "RAI");
        Man man2 = new Man("Adam junior", 20, "RAI");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman = new Woman("Eva", 40, "RAI");
        Woman woman2 = new Woman("Jeneva", 23, "RAI");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
