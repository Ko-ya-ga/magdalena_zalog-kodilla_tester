package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        books.add(new Book(author, title));
        return new Book(author, title);
    }
}
