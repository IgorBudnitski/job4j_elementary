package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i]; // taking the [i] index of array to keep somewhere
            data[i] = data[index]; // entering min number in the [i]
            data[index] = temp; // taking the temp and putting instead of min number that we have found
        }
        return data;
    }
}
