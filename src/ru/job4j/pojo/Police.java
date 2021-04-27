package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Igor Budnitski");
        license.setModel("Toyota Carolla");
        license.setCode("123ABC");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car " + license.getModel() + " with reg number "
                + license.getCode() + " registered " + license.getCreated());
    }
}
