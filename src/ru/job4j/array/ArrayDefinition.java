package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] name = new String[4];
        System.out.println("ages = " + ages.length);
        System.out.println("surnames = " + surnames.length);
        System.out.println("prices = " + prices.length);

        name[0] = "Igor Bunnies";
        name[1] = "John Snow";
        name[2] = "Andrew Barrymore";
        name[3] = "Steven Lows";

        System.out.println("name 1 = " + name[0]);
        System.out.println("name 2 = " + name[1]);
        System.out.println("name 3 = " + name[2]);
        System.out.println("name 4 = " + name[3]);
    }
}
