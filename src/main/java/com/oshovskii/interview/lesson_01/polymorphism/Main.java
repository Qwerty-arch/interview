package com.oshovskii.interview.lesson_01.polymorphism;

public class Main {
    public static void main(String[] args) {

        Figure triangle = new Triangle(20.0f, 7.0f);
        Figure rectangle = new Rectangle(15.0f, 8.0f);
        Figure circle = new Circle(33.0f);

        System.out.printf("Triangle area: %s\nRectangle area: %s\nCircle area: %s", triangle.getArea(), rectangle.getArea(), circle.getArea());
    }
}
