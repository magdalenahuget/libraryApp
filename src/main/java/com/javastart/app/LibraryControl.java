package com.javastart.app;

import com.javastart.exception.NoSuchOptionException;
import com.javastart.io.ConsolePrinter;
import com.javastart.io.DataReader;
import com.javastart.model.Book;
import com.javastart.model.Library;
import com.javastart.model.Magazine;
import com.javastart.model.Publication;

import java.util.InputMismatchException;

public class LibraryControl {
    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);

    private Library library = new Library();

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
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
        Publication[] publications = library.getPublications();
        printer.printMagazine(publications);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addPublication(book);
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBook(publications);
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

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", enter option again.");
            } catch (InputMismatchException ignored) {
                printer.printLine("Incorrect value.");
            }
        }
        return option;
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
