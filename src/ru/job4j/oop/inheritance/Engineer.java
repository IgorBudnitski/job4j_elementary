package ru.job4j.oop.inheritance;

public class Engineer extends Profession {

    private String education;

    public Engineer(String name, String surname, String education, int age, String education1) {
        super(name, surname, education, age);
        this.education = education1;
    }

    public void invent() {

    }
}
