package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(4,5);
        Square square = new Square(3);
        ShapeProcessor processor = new ShapeProcessor();
        processor.process(rectangle);
        processor.process(triangle);
        processor.process(square);
    }

}
