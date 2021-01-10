package com.kodilla.abstracts.homework.task1;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void surfaceArea() {
        int surfaceArea = width * height;
        System.out.println("Surface area of this rectangle is " + surfaceArea);
    }

    @Override
    public void perimeter() {
        int perimeter = 2 * height + 2 * width;
        System.out.println("Perimeter of this rectangle is " + perimeter);
    }
}
