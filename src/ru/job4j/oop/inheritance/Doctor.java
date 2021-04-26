package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String speciality;

    public void diagnose() {
        System.out.println("Diagnose: sick");
    }
}
