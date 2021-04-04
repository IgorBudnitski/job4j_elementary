package ru.job4j.condition.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicAndTest {

    @Test
    public void test() {
        assertFalse(LogicAnd.check(-1));
        assertFalse(LogicAnd.check(1));
        assertTrue(LogicAnd.check(2));
    }
}