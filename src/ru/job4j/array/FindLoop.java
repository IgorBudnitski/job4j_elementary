package ru.job4j.array;

/*
В этом задании нужно усовершенствовать классический поиск. Теперь нужно сделать поиск по массиву, но не во всем массиве, а только в указанном диапазоне.
    data - массив чисел,
    el - элемент, который нужно найти,
    start - индекс, с которого начинаем поиск,
    finish - индекс, которым заканчиваем поиск.
 */

public class FindLoop {
    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
