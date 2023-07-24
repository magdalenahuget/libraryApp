package com.javastart;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v 0.1";

        String title = "Harry Potter and the Philosopher's Stone";
        String author = "J. K. Rowling";
        int releaseDate = 1997;
        int pages = 223;
        String publisher ="Bloomsbury";
        String isbn = "123456";

        Book book = new Book(title, author, releaseDate, pages, publisher, isbn);

        System.out.println(appName);
        System.out.println("Available books:");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseDate);
        System.out.println(pages);
        System.out.println(publisher);
        System.out.println(isbn);
    }
}
