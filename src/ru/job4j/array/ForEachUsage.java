package ru.job4j.array;

public class ForEachUsage {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");
                /*
        Printing using For-each
         */
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
