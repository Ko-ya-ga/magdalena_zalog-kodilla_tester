package com.kodilla.examples;

public class SimpleArray {
    public static void main(String[] args) {

        String[] harryPotterParts = new String[7]; {

            harryPotterParts[0] = "The Philosoper's Stone";
            harryPotterParts[1] = "The Chamber of Secrets";
            harryPotterParts[2] = "The Prisoner of Azkaban";
            harryPotterParts[3] = "The Goblet of Fire";
            harryPotterParts[4] = "The Order of the Phoenix";
            harryPotterParts[5] = "The Half-Blood Prince";
            harryPotterParts[6] = "The Deathly Hallows";
        }
        String harryPotterPart = harryPotterParts[3];
        System.out.println(harryPotterPart);

        int numberOfElements = harryPotterParts.length;
        System.out.println(numberOfElements);
        System.out.println("My array contains 7 elements.");
    }
}
