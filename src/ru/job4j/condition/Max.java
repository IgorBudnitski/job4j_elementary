package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
//        System.out.println(Max.max(1, 2,3));
//        System.out.println(Max.max(7, 2,1));
//        System.out.println(Max.max(1, 14,3));
        System.out.println(Max.max(1, 7, 3, 4));

    }

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
