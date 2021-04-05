package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = 0;
        int finishIndex = array.length - 1;
        for (int startIndex = 0; startIndex < array.length / 2; startIndex++) {
            temp = array[startIndex];
            array[startIndex] = array[finishIndex];
            array[finishIndex] = temp;
            finishIndex--;
        }
        return array;
    }
}
