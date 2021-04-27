package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setFullName("Igor Budnitski");
        stud1.setGroup("C00012");
        stud1.setAdmissionDate(new Date());

        System.out.println("Student name: " + stud1.getFullName() + System.lineSeparator()
                + "Group: " + stud1.getGroup() + System.lineSeparator()
                + "Admission date: " + stud1.getAdmissionDate());
    }
}
