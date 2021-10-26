package ru.bfu.ipmit.lab3;

public class Square extends Rectangle {

    Square() {
    }

    Square(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD) {
        pointA[0] = xA;
        pointA[1] = yA;

        pointB[0] = xB;
        pointB[1] = yB;

        pointC[0] = xC;
        pointC[1] = yC;

        pointD[0] = xD;
        pointD[1] = yD;
    }


    static Square fromArea(double area) {
        var size = Math.sqrt(area);
        return new Square(0, 0, 0, size, size, 0, size, size);
    }
}
