package com.javastart.io;

import com.javastart.model.Book;
import com.javastart.model.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter consolePrinter;

    public DataReader(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void close() {
        scanner.close();
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String getString(){
        return scanner.nextLine();
    }

    public Book readAndCreateBook() {
        consolePrinter.printLine("Title: ");
        String title = scanner.nextLine();
        consolePrinter.printLine("Author: ");
        String author = scanner.nextLine();
        consolePrinter.printLine("Publisher: ");
        String publisher = scanner.nextLine();
        consolePrinter.printLine("ISBN: ");
        String isbn = scanner.nextLine();
        consolePrinter.printLine("Release date: ");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        consolePrinter.printLine("Pages: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        consolePrinter.printLine("Title: ");
        String title = scanner.nextLine();
        consolePrinter.printLine("Publisher: ");
        String publisher = scanner.nextLine();
        consolePrinter.printLine("Language: ");
        String language = scanner.nextLine();
        consolePrinter.printLine("Release date: ");
        int year = getInt();
        consolePrinter.printLine("Month: ");
        int month = getInt();
        consolePrinter.printLine("Day: ");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }
}