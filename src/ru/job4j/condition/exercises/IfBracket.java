package ru.job4j.condition.exercises;

public class IfBracket {
    public static void showA() {
        System.out.println("A");
    }

    public static void showB() {
        System.out.println("B");
    }

    public static void show(int num) {
        if (num > 1) {
            showA();
            showB();
        }
    }
}
