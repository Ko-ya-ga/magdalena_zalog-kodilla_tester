package com.kodilla;

public class Notebook {
    public int weight;
    public int price;
    public int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight < 3000) {
            System.out.println("This notebooks isn't very heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkPriceAndYear() {
        if (this.price < 600 && this.year < 2005) {
            System.out.println("This notebook is very cheap and very old");
        } else if (this.price < 600 && this.year > 2005 && this.year < 2015) {
            System.out.println("This notebook is very cheap and not so old");
        } else if (this.price < 600 && this.year > 2015) {
            System.out.println("This notebook is very cheap and new");
        } else if (this.price > 600 && this.price < 1000 && this.year < 2005) {
            System.out.println("This notebook has a good prize and it's very old");
        } else if (this.price > 600 && this.price < 1000 && this.year > 2005 && this.year < 2015) {
            System.out.println("This notebook has a good prize and it's not so old");
        } else if (this.price > 600 && this.price < 1000 && this.year > 2015) {
            System.out.println("This notebook has a good prize and it's new");
        } else if (this.price > 1000 && this.year < 2005) {
            System.out.println("This notebook is expensive and very old");
        } else if (this.price > 1000 && this.year > 2005 && this.year < 2015) {
            System.out.println("This notebook is expensive and not so old");
        } else if (this.price > 1000 && this.year > 2015) {
            System.out.println("This notebook is expensive and new");
        }
    }
}

