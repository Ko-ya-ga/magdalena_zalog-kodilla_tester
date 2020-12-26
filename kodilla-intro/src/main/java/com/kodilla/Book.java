package com.kodilla;

public class Book {
    private static String author;
    private static String title;

    public static String of(String author, String title) {
        return author + title;
    }

    public static void main(String[] args) {
        String book = Book.of("Jack London", "The White Fang");
        System.out.println(book);
    }

}
