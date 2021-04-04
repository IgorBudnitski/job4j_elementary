package ru.job4j.condition.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCheckTest {
    @Test
    public void test() {
        assertFalse(OddCheck.check(2));
        assertTrue(OddCheck.check(3));
    }
}