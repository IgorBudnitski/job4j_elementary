package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        double s = SqArea.square(p, k);
        assertEquals(s, expected, 0.8);
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        double s = SqArea.square(p, k);
        assertEquals(s, expected, 0.8);
    }
}