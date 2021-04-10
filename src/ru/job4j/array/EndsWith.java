package ru.job4j.array;
/*
В JDK есть класс String. В нем есть метод endsWith. Этот метод проверяет то, что слово
заканчивается на определенную последовательность.

Например.
Привет - вет > true
Привет - вит > false.
В этом задании вам нужно будет написать свой аналогичный метод.
Давайте создадим каркас класса и напишем сразу тесты.
 */

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordIndex = word.length - 1;
        for (int i = post.length - 1; i > 0; i--) {
            if (post[i] != word[wordIndex]) {
                return false;
            }
            wordIndex--;
        }
        return result;
    }
}
