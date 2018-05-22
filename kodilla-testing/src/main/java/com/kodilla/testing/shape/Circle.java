package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.pow(r, 2)*Math.PI;
    }
}
