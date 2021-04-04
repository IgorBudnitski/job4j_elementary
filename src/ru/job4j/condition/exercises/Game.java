package ru.job4j.condition.exercises;

/*
Метод принимает 3 параметра:

1. Вероятность выигрыша;

2. Стоимость выигрыша;

3. Цена игры.

Необходимо реализовать метод так, чтобы при условии, что сумма выигрыша (произведение вероятности и стоимости выигрыша)
превышает цену игры, метод вернул разницу между этими величинами (т.е. чистую прибыль), или вернул 0 (при условии что
чистая прибыль меньше или равна 0).
 */
    public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        return (percent * prize) > pay ? (int) (percent * prize) - pay : 0;
    }
}
