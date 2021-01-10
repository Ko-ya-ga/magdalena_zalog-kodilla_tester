package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private final int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void surfaceArea() {
        int surfaceArea = width * width;
        System.out.println("Surface area of this square is " + surfaceArea);
    }

    @Override
    public void perimeter() {
        int perimeter = width * 4;
        System.out.println("Perimeter of this square is " + perimeter);
    }
}
