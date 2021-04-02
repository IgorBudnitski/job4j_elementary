package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        // ссылочные типы данных нельзя сравнивать через ==
        String first = new String("one");
        String one = new String("one");
        if (first == one) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
        // ссылочные типы данных нужно сравнивать через "equals"
        String first1 = new String("one");
        String one1 = new String("one");
        if (first1.equals(one1)) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
    }
}
