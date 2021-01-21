package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book a = BookManager.createBook("Terry Pratchett", "Mort");
        Book b = BookManager.createBook("Henryk Sienkiewicz", "Quo Vadis");
        Book c = BookManager.createBook("Victor Hugo", "Notre Dame de Paris");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        Book d = BookManager.createBook("Henryk Sienkiewicz", "Quo Vadis");
        System.out.println(b == d);
    }
}
