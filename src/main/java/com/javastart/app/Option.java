package com.javastart.app;

public enum Option {
    EXIT(0, "Exit from a program"),
    ADD_BOOK(1, "Exit from a program"),
    ADD_MAGAZINE(2, "Exit from a program"),
    PRINT_BOOKS(3, "Exit from a program"),
    PRINT_MAGAZINES(4, "Exit from a program");

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

    static Option createFromInt(int option){
        return Option.values()[option];
    }
}
