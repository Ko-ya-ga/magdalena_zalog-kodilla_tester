package com.kodilla.abstracts.homework.task1;

public class Triangle extends Shape {
    private final int width;
    private final int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void surfaceArea() {
        int surfaceArea = width * height / 2;
        System.out.println("Surface area of this triangle is " + surfaceArea);
    }

    @Override
    public void perimeter() {
        int perimeter = 0;
        System.out.println("Perimeter of this triangle is " + perimeter);
    }
}
