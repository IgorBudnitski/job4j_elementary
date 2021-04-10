package ru.job4j.array;

/*
В этом задании нужно написать программу, которая сравнивает последние элементы массивов.

Если последние элементы у массивов равны, то нужно вернуть true. В противном случае - false

 */

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[left.length - 1] == right[right.length - 1]) {
            return true;
        }
        return false;
    }
}
