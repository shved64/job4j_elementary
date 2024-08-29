package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFrom1To5Then120() {
        int number = 5;
        int expected = 120;
        int result = Factorial.calculate(number);
        assertEquals(expected, result);
    }
}