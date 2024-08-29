package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int calculate = 1;
        for (int i = 2; i <= number; i++) {
        calculate = calculate * i;
    }
        return calculate;
    }
    }

