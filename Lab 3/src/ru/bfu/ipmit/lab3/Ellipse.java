package ru.bfu.ipmit.lab3;

public class Ellipse implements Shape {
    protected double largeSemiAxis;
    protected double smallSemiAxis;
    protected int[] centralPoint = new int[2];

    Ellipse() {
    }

    Ellipse(double largeSemiAxis, double smallSemiAxis, int x, int y) {
        this.largeSemiAxis = largeSemiAxis;
        this.smallSemiAxis = smallSemiAxis;
        centralPoint[0] = x;
        centralPoint[1] = y;
    }

    @Override
    public double getArea() {
        return Math.PI * largeSemiAxis * smallSemiAxis;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * ((getArea() + (largeSemiAxis - smallSemiAxis)) / (largeSemiAxis + smallSemiAxis));
    }

    @Override
    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }
}
