package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {

    private boolean armySurgeon;

    public Surgeon(boolean armySurgeon) {
        this.armySurgeon = armySurgeon;
    }

    public void cut() {
        System.out.println("Make a cut.");
    }
}
