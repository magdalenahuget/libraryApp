package com.javastart.app;

import com.javastart.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v 0.1";

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                1997, 223, "Bloomsbury", "9780545069670");

        Book book2 = new Book("Harry Potter And The Chamber Of Secrets", "J. K. Rowling",
                1998 , 341, "Bloomsbury");

        System.out.println(appName);
        System.out.println("Available books:");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
