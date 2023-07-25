package com.javastart.app;

import com.javastart.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v 0.1";

        Book[] books = new Book[1000];

        books[0] = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                1997, 223, "Bloomsbury", "9780545069670");

        books[1] = new Book("Harry Potter And The Chamber Of Secrets", "J. K. Rowling",
                1998 , 341, "Bloomsbury");

        books[2] = new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling",
                1999 , 317, "Bloomsbury", "9780605953208");

        System.out.println(appName);
        System.out.println("Available books:");
        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
    }
}
