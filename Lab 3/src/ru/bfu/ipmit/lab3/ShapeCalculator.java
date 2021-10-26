package ru.bfu.ipmit.lab3;

public interface ShapeCalculator {
    default double getArea(Shape[] shapes) {
        double summArea = 0;
        for (Shape shape : shapes) {
            summArea += shape.getArea();
        }
        return summArea;
    }
}
