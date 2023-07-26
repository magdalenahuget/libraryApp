package com.javastart.model;

public class Library {
    private static final int maxBooks = 1000;
    private Book[] books = new Book[maxBooks];
    private int booksNumber;

    public void addBook(Book book) {
        if (booksNumber < maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("The maximum number of books has been reached in the library.");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("There are no books in the library.");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
