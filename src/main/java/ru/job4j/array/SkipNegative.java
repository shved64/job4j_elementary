package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int cow = 0; cow < array.length; cow++) {
            for (int cell = 0; cell < array[cow].length; cell++) {
                if (array[cow][cell] < 0) {
                    array[cow][cell] = 0;
                }
            }
        }
        return array;
    }
}