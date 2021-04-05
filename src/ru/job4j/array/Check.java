package ru.job4j.array;

import java.nio.file.FileAlreadyExistsException;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                return false;
            }
        }
        return true;
    }
}
