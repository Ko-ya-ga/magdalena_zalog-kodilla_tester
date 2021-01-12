package com.kodilla.abstracts.homework.task2;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Lawyer lawyer = new Lawyer();
        Priest priest = new Priest();
        Person jan = new Person("Jan", 32, teacher);
        jan.getJob().showResponsibilities();
        // dostawanie się do obowiązków danej osoby - najpierw wywołanie gettera (czyli jaka praca przypisana do danej osoby)
        // dopiero później metoda z pokazaniem obowiązków z tej pracy
        Person ewa = new Person("Ewa", 23, lawyer);
        ewa.getJob().showResponsibilities();
    }
}
