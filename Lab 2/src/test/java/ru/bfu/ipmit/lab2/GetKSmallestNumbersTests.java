package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests {

    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {8, 9, 1, 10};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {1, 8};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnKSmallestNumbers1() {
        byte[] array = {43, 98, 9, 31, 124, 90, 71, 25, 63, 109, 43, 115, 64, 118, 84, 101, 55, 78, 60, 21, 32, 27, 17, 106, 101, 100, 46, 75, 115, 26, 5, 70, 102, 35, 95, 6, 41, 56, 65, 88, 53, 27, 94, 26, 88, 112, 81, 124, 78, 13, 23, 109, 83, 122, 89, 112, 48, 105, 84, 18, 22, 10, 122, 117, 65, 121, 35, 73, 45, 22, 7, 79, 7, 27, 30, 112, 17, 51, 123, 35, 42, 94, 77, 122, 17, 121, 101, 57, 46, 36, 33, 45, 107, 101, 110, 4, 57, 22, 38, 1, 114, 103, 55, 32, 41, 23, 81, 7, 111, 43, 54, 31, 120, 24, 20, 94, 81, 62, 100, 3, 116, 82, 52, 19, 34, 71, 27, 15, 10, 106, 43, 77, 35, 116, 101, 75, 43, 68, 23, 18, 70, 86, 19, 35, 13, 50, 115, 70, 49, 70, 99, 77, 76, 113, 67, 127, 58, 52, 1, 6, 80, 68, 86, 27, 91, 35, 85, 63, 65, 22, 73, 63, 68, 3, 96, 123, 29, 30, 32, 118, 23, 16, 25, 40, 52, 6, 6, 33, 79, 110, 33, 11, 116, 18, 126, 82, 123, 100, 122, 57};
        int k = 15;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {1, 1, 3, 3, 4, 5, 6, 6, 6, 6, 7, 7, 7, 9, 10};
        assertArrayEquals(actualResult, expectedResult);
    }

}
