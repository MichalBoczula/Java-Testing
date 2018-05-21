package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShape() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (this.a*this.h)/2;
    }
}
