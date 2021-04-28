package ru.job4j.oop.inheritance;

public class Doctor extends Profession {

    private String speciality;

    public Doctor(String name, String surname, String education, int age, String speciality) {
        super(name, surname, education, age);
        this.speciality = speciality;
    }

    public void diagnose() {
        System.out.println("Diagnose: sick");
    }
}
