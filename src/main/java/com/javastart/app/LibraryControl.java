package com.javastart.app;

import com.javastart.io.DataReader;
import com.javastart.model.Book;
import com.javastart.model.Library;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

//    Book[] books = new Book[1000];

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("There is no such option, please re-enter.");
            }
        } while (option != EXIT);
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
        System.out.println(EXIT + "-exit from a program");
        System.out.println(ADD_BOOK + "-add a new book");
        System.out.println(PRINT_BOOKS + "-print all available books");

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
