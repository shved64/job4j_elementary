package ru.job4j.array;

public class SimpleStringEncoder {
    private static String appendEncoded(String result, char symbol, int counter) {
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = appendEncoded(result, symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result = appendEncoded(result, symbol, counter);
        return result;
    }
}





