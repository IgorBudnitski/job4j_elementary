package ru.job4j.oop.inheritance;

public class Builder extends Engineer {

    private String builderType;

    public Builder(String name, String surname, String education, int age, String education1, String builderType) {
        super(name, surname, education, age, education1);
        this.builderType = builderType;
    }

    public void build() {

    }

}
