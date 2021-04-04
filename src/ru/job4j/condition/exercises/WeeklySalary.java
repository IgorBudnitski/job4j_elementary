package ru.job4j.condition.exercises;
/*
Метод принимает массив целочисленных значений, при этом каждый элемент массива означает количество часов,
которые работник отработал в каждый день недели. Работник может работать и в выходные. При этом оплачивается
труд следующим образом:

1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.

2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.

3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и сверхурочные.

Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 */

import java.lang.reflect.Array;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            int leftOVer = 0;
            if (hours[i] <= 8 && i <= 4) {
                sum = sum + (hours[i] * 10);
            } else if (hours[i] > 8 && i <= 4) {
                leftOVer = hours[i] % 8;
                hours[i] = hours[i] - leftOVer;
                sum = sum + (hours[i] * 10 + leftOVer * 15);
            } else if (hours[i] <= 8 && i > 4) {
                sum = sum + (hours[i] * 20);
            } else if (hours[i] > 8 && i > 4) {
                leftOVer = hours[i] % 8;
                hours[i] = hours[i] - leftOVer;
                sum = sum + (hours[i] * 20 + leftOVer * 30);
            }
        }
        return sum;
    }
}
