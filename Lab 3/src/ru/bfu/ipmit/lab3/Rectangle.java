package ru.bfu.ipmit.lab3;

public class Rectangle implements Shape {
    protected double[] pointA = new double[2];
    protected double[] pointB = new double[2];
    protected double[] pointC = new double[2];
    protected double[] pointD = new double[2];

    Rectangle() {
    }

    Rectangle(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD) {
        pointA[0] = xA;
        pointA[1] = yA;

        pointB[0] = xB;
        pointB[1] = yB;

        pointC[0] = xC;
        pointC[1] = yC;

        pointD[0] = xD;
        pointD[1] = yD;
    }

    @Override
    public double getArea() {
        double sideA = tPifagora(pointA, pointB);
        double sideB = tPifagora(pointB, pointC);
        return Math.abs(sideA * sideB);
    }

    @Override
    public double getPerimeter() {
        double sideA = tPifagora(pointA, pointB);
        double sideB = tPifagora(pointB, pointC);
        return (Math.abs(sideA) + Math.abs(sideB)) * 2;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }

    private double tPifagora(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }
}
