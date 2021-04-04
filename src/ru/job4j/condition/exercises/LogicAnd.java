package ru.job4j.condition.exercises;

/*
Чтобы проверить, что оба выражения являются истинными нужно использовать &&. Синтаксис

выражение1 && выражение2

В данной задаче вам нужно проверить, что переданное число положительно И четное
 */

public class LogicAnd {
    public static boolean check(int num) {
        return num % 2 == 0 && num > 0;
    }
}
