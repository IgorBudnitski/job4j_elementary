package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {

    private int iq;

    public Programmer(String name, String surname, String education, int age, String education1, int iq) {
        super(name, surname, education, age, education1);
        this.iq = iq;
    }

    public void writeCode() {

    }
}
