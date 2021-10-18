package ru.bfu.ipmit.lab2;

public class Lab2 {

    /**
     * Метод getKSmallestNumbers возвращает k наименьших элементов в массиве array, отсортированных в порядке возрастания
     *
     * @param array неотсортированный массив типа byte произвольной длины n
     * @param k целочисленный параметр, 0 <= k <= n
     * @return отсортированный массив из k наименьших элементов
     *
     * ПРИМЕР:
     * Вход: array = [8, 9, 1, 10], k = 2
     * Выход: [1, 8]
     *
     */
    static byte[] getKSmallestNumbers(byte[] array, int k) {
        for (int i = 1; i< array.length; i++) {
            int j = i;
            while (j > 0 && array[j]<array[j-1]) {
                var t = array[j];
                array[j] = array[j-1];
                array[j-1] = t;
                j--;
            }
        }

        byte[] trueArray = new byte[k];
        for (int i = 0; i < k; i++) {
            trueArray[i] = array[i];
        }
        return trueArray;
    }

    /**
     * Метод arePermutations проверяет, является ли первая строка перестановкой второй, то есть может ли первая строка
     * быть получена из второй путем перестановки символов.
     *
     * @param firstString первая строка произвольной длины, состоящая из цифр 0...9
     *                    и строчных букв латинского алфавита a...z
     * @param secondString вторая строка произвольной длины
     * @return true, если первая строка является перестановкой второй
     *         false, в противном случае
     *
     * ПРИМЕР 1:
     * Вход: firstString = "ab1", secondString = "b1a"
     * Выход: true
     *
     * ПРИМЕР 2:
     * Вход: firstString = "ab", secondString = "aa"
     * Выход: false
     *
     */
    static boolean arePermutations(String firstString, String secondString) {
        var arrayFirstString = arrayOfWordsAndNums(firstString);
        var arraySecondString = arrayOfWordsAndNums(secondString);
        for (int i = 0; i < arrayFirstString.length; i++) {
            if (arrayFirstString[i] != arraySecondString[i]) {
                return false;
            }
        }
        return true;
    }

    static int[] arrayOfWordsAndNums (String str) {
        String symbols = "09az";
        var countOfSymbols = (int)'9' - (int)'0' + (int)'z' - (int)'a';
        var returnArray = new int[countOfSymbols];
        for (int i = 0; i < str.length(); i++) {
            var kod =  (int)str.charAt(i);
            if (kod <= (int)'9') {
                kod -= (int)'0';
            } else {
                kod -= (int)'a';
                kod += 9;
            }
            returnArray[kod]++;
        }
        System.out.println();
        return returnArray;
    }

    /**
     * Метод rotateMatrix совершает поворот элементов квадратной матрицы на 90 градусов по часовой стрелке
     *
     * @param matrix целочисленная квадратная матрица
     * @return целочисленная квадратная матрица, полученная путем поворота исходной матрицы на 90 градусов
     *         по часовой стрелке
     *
     * ПРИМЕР:
     * Вход: matrix = [1, 2, 3
     *                 4, 5, 6
     *                 7, 8, 9]
     * Выход: [7, 4, 1
     *         8, 5, 2
     *         9, 6, 3]
     *
     */
    static int[][] rotateMatrix(int[][] matrix) {
        var count = matrix.length;
        int[][] newMatrix = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                newMatrix[j][(count-1) - i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

}
