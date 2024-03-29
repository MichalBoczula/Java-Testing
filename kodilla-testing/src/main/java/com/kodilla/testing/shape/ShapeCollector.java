package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;

        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int number) {
        Shape shape = null;

        if (number >= 0 && number < shapes.size()){
            shape = shapes.get(number);
        }
        return shape;
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
