package com.javastart.app;

import com.javastart.io.DataReader;
import com.javastart.model.Book;
import com.javastart.model.Library;
import com.javastart.model.Magazine;

public class LibraryControl {

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("There is no such option, please re-enter.");
            }
        } while (option != Option.EXIT);
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
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
        for (Option option : Option.values()) {
            System.out.println(option);
        }
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
