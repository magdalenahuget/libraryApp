package com.javastart.app;

import com.javastart.io.DataReader;
import com.javastart.model.Book;
import com.javastart.model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    Book[] books = new Book[1000];

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("There is no such option, please re-enter.");
            }
        } while (option != exit);
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void printOptions() {
        System.out.println("Choose option:");
        System.out.println(exit + "-exit from a program");
        System.out.println(addBook + "-add a new book");
        System.out.println(printBooks + "-print all available books");

    }

    private void exit() {
        System.out.println("Program end.");
        dataReader.close();
    }

//        books[0] = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling",
//                1997, 223, "Bloomsbury", "9780545069670");
//
//        books[1] = new Book("Harry Potter And The Chamber Of Secrets", "J. K. Rowling",
//                1998, 341, "Bloomsbury");
//
//        books[2] = new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling",
//                1999, 317, "Bloomsbury", "9780605953208");

}
