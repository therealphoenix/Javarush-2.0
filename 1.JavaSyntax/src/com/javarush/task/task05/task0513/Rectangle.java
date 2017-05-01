package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int weight, int height) {
        this.top = top;
        this.left = left;
        this.width = weight;
        this.height = height;
    }
    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void initialize(int top, int left, int weight) {
        this.top = top;
        this.left = left;
        this.width = weight;
        this.height = weight;
    }
    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public static void main(String[] args) {

    }
}
