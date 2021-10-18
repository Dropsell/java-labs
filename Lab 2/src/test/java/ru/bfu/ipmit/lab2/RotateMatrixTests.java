package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateMatrixTests {

    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertArrayEquals(actualResult, expectedResult);
    }

}