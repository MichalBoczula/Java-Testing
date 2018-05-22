package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }
}
