package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {

    private boolean orthodontist;

    public Dentist(boolean orthodontist) {
        this.orthodontist = orthodontist;
    }

    public void removeTooth() {
        System.out.println("Remove tooth");
    }
}
