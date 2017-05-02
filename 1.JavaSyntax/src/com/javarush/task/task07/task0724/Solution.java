package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
       Human h1 = new Human("h1",true, 21);
       Human h2 = new Human("h2",false, 21);
       Human h3 = new Human("h3",true, 21);
       Human h4 = new Human("h4",false, 21);
       Human f1 = new Human("f1",false,12, h1, h2);
       Human f2 = new Human("f2",false,13, h1, h2);
       Human f3 = new Human("f3",false,14, h1, h2);
       Human f4 = new Human("f4",false,15, h1, h2);
       Human f5 = new Human("f5",false,16, h1, h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















