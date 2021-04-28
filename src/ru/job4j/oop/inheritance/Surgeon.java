package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {

    private boolean armySurgeon;

    public Surgeon(String name, String surname, String education, int age, String speciality, boolean armySurgeon) {
        super(name, surname, education, age, speciality);
        this.armySurgeon = armySurgeon;
    }

    public void cut() {
        System.out.println("Make a cut.");
    }
}
