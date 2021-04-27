package ru.job4j.oop.inheritance;

public class Doctor extends Profession {

    private String speciality;

    public Doctor() {

    }

    public Doctor(String speciality) {
        this.speciality = speciality;
    }

    public void diagnose() {
        System.out.println("Diagnose: sick");
    }
}
