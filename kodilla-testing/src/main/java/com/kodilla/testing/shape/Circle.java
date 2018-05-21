package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public double getField() {
        return this.r*this.r*3.14;
    }
}
