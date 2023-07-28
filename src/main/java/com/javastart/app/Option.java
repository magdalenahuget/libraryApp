package com.javastart.app;

import com.javastart.exception.NoSuchOptionException;

public enum Option {
    EXIT(0, "Exit from a program"),
    ADD_BOOK(1, "Add a new book"),
    ADD_MAGAZINE(2, "Add a new magazine"),
    PRINT_BOOKS(3, "Display all available books"),
    PRINT_MAGAZINES(4, "Display all available magazines");

    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Option=" + value + "-" + description;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("There is no option with id " + option);
        }
    }
}
