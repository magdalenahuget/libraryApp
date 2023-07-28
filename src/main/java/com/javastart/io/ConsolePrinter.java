package com.javastart.io;

import com.javastart.model.Book;
import com.javastart.model.Magazine;
import com.javastart.model.Publication;

public class ConsolePrinter {

    public void printBook(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0) {
            printLine("There are no books in library.");
        }
    }

    public void printMagazine(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0) {
            printLine("There are no magazines in library.");
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}
