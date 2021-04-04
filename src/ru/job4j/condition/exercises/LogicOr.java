package ru.job4j.condition.exercises;

/*
Чтобы проверить, что одно или оба выражения являются истинными нужно использовать ||. Синтаксис

выражение1 || выражение2

В данной задаче вам нужно проверить, что переданное число отрицательно ИЛИ нечетно
 */

public class LogicOr {
    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;
    }
}
