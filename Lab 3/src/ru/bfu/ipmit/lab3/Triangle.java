package ru.bfu.ipmit.lab3;

public class Triangle implements Shape {
    private int[] pointA = new int[2];
    private int[] pointB = new int[2];
    private int[] pointC = new int[2];

    Triangle() {
    }

    Triangle(int xA, int yA, int xB, int yB, int xC, int yC) {
        pointA[0] = xA;
        pointA[1] = yA;

        pointB[0] = xB;
        pointB[1] = yB;

        pointC[0] = xC;
        pointC[1] = yC;
    }

    @Override
    public double getArea() {
        var poluPerimeter = 1.0 * getPerimeter() / 2;
        double sideA = tPifagora(pointA, pointB);
        double sideB = tPifagora(pointB, pointC);
        double sideC = tPifagora(pointA, pointC);

        return Math.sqrt(poluPerimeter * (poluPerimeter - sideA) * (poluPerimeter - sideB) * (poluPerimeter - sideC));
    }

    @Override
    public double getPerimeter() {
        double sideA = tPifagora(pointA, pointB);
        double sideB = tPifagora(pointB, pointC);
        double sideC = tPifagora(pointA, pointC);
        return sideA + sideB + sideC;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    private double tPifagora(int[] point1, int[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }
}
