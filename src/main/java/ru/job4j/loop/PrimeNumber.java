package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return prime;
    }
}
