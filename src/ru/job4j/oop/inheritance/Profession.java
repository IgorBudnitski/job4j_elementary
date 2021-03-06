package ru.job4j.oop.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int age;

    public Profession(String name, String surname, String education, int age) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

}
