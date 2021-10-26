package ru.bfu.ipmit.lab3;

public class Circle extends Ellipse implements WithRadius {

    Circle() {
    }

    Circle(double radius, int x, int y) {
        this.largeSemiAxis = radius;
        this.smallSemiAxis = radius;
        centralPoint[0] = x;
        centralPoint[1] = y;
    }

    @Override
    public double getRadius() {
        return largeSemiAxis;
    }

    static Circle fromArea(double area) {
        var radius = Math.sqrt(area / Math.PI);
        return new Circle(radius, 0, 0);
    }
}
