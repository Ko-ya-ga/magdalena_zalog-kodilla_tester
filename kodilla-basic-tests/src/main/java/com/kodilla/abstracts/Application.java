package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog(4);
        dog.giveVoice();

        Duck duck = new Duck(2);
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);
    }
}
