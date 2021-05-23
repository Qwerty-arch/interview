package com.oshovskii.interview.lesson_01.polymorphism;

public class Triangle extends Figure {
    private float height;
    private float base;

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return 0.5f * height * base;
    }
}
