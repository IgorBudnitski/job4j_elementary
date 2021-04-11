package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("tra tra tra");
    }

    public void song(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    public static void main(String[] args) {
        Student igor = new Student();
        String song = "I belive I can fly!";
        igor.music();
        igor.song(song);
        igor.music();
        igor.song(song);
        igor.music();
        igor.song(song);
    }
}
