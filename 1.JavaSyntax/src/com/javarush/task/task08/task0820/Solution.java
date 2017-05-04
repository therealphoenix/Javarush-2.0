package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for(int i = 0; i < 4; i++){
            result.add(new Cat());
        }
         return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> set = new HashSet<>();
        for(int i = 0; i < 3; i++){
            set.add(new Dog());
        }
        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> resultSet = new HashSet<>(cats);
        resultSet.addAll(dogs);
        return resultSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
      }

    public static void printPets(Set<Object> pets) {
        for(Object o : pets){
            System.out.println(o);
        }
    }

    public static class Cat {}
    public static class Dog {}
}
