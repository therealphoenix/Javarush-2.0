package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Child1", true, 10, null);
        Human child2 = new Human("Child2", false, 12, null);
        Human child3 = new Human("Child3", false, 13, null);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Father", true, 30, children);
        Human monther = new Human("Monther", false, 40, children);
        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);
        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(monther);
        Human grandfather1 = new Human("GF1", true, 70, parents1);
        Human grandfather2 = new Human("GF1", true, 65, parents2);
        Human grandmather1 = new Human("GM1", false, 50, parents1);
        Human grandmather2 = new Human("GM2", false, 56, parents2);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmather1);
        System.out.println(grandmather2);
        System.out.println(monther);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {

        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children == null)
                return text;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}