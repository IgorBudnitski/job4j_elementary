package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", 200);
        Book book2 = new Book("Clean code", 56);
        Book book3 = new Book("Pride and Prejudice", 542);
        Book book4 = new Book("The Book Thief", 200);
        Book[] arr = new Book[3];
        arr[0] = book1;
        arr[1] = book2;
        arr[2] = book3;

        for (int i = 0; i < arr.length; i++) {
            Book lb = arr[i];
            System.out.println("Name: " + lb.getName() + System.lineSeparator() + "Number of pages: " + lb.getPages()
                    + System.lineSeparator());
        }

        System.out.println("Changing [0] and [3] in places");

        Book temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        for (int i = 0; i < arr.length; i++) {
            Book lb = arr[i];
            System.out.println("Name: " + lb.getName() + System.lineSeparator() + "Number of pages: " + lb.getPages()
                    + System.lineSeparator());
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName() == "Clean code") {
                System.out.println("Book " + arr[i].getName() + " found.");
            }
        }
    }
}
