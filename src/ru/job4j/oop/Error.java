package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active " + active);
        System.out.println("Status " + status);
        System.out.println("Message " + message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        err1.printInfo();
        Error err2 = new Error(true, 12, "Error exists");
        Error err3 = new Error(false, -1548, "Hello Dude!");
        err2.printInfo();
        err3.printInfo();
    }
}
