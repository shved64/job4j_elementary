package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    private String name;

    public String surname;
    public static final String NEW_VALUE = "";

    public void broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c) {
    }
}

