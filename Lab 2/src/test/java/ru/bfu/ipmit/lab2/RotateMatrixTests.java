package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateMatrixTests {

    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldRotateMatrix1() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldRotateMatrix2() {
        int[][] matrix = {{1, 2}, {3, 4}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{3, 1}, {4, 2}};
        assertArrayEquals(actualResult, expectedResult);
    }
}
