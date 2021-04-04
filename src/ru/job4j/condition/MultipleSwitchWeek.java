package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 2;
            case "Четверг", "Thursday" -> 2;
            case "Пятница", "Friday" -> 2;
            case "Суббота", "Saturday" -> 2;
            case "Воскресенье", "Sunday" -> 2;
            default -> -1;

        };
    }
}
