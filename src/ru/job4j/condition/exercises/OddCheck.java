package ru.job4j.condition.exercises;

/*
Для проверки, что два числа НЕ равны друг другу используется оператор !=.
В данной задаче нужно проверить, что переданное число является НЕ четным.
Для проверки используйте операторы % и !=
 */

import ru.job4j.condition.TrgArea;

public class OddCheck {
    public static boolean check(int num) {
        return num % 2 != 0;
    }
}
