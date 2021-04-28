package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {

    private boolean orthodontist;

    public Dentist(String name, String surname, String education, int age, String speciality, boolean orthodontist) {
        super(name, surname, education, age, speciality);
        this.orthodontist = orthodontist;
    }

    public void removeTooth() {
        System.out.println("Remove tooth");
    }
}
