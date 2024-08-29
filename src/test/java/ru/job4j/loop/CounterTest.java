package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom0To5Then15() {
    int start = 0;
    int finish = 5;
    int expected = 15;
    int result = Counter.sum(start, finish);
    assertEquals(expected, result);
    }

    @Test
    void whenSumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertEquals(expected, result);
    }

    @Test
    void whenSumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertEquals(expected, result);
    }

    @Test
    void whenSumFrom4To2Then0() {
        int start = 4;
        int finish = 2;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertEquals(expected, result);
    }
}