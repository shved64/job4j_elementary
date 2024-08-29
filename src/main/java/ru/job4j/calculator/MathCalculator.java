package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubstanceDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAllFunction(double first, double second) {
        return subtract(first, second)
                + divide(first, second)
                 + multiply(first, second)
                  + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("��������� ������� �����: " + sumAndMultiply(10, 20));
        System.out.println("��������� ������� �����: " + sumSubstanceDivide(20, 10));
        System.out.println("��������� ������� �����: " + sumAllFunction(5, 5));
    }
}