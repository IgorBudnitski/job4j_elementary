package ru.job4j.condition.exercises;

public class AttackRook {
    public static boolean check(String left, String right) {
        char[] strToArray = left.toCharArray();
        char[] strToArray2 = right.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == strToArray2[i]) {
                return true;
            }
        }
        return false;
    }
}
