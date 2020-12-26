package com.kodilla;
import java.util.Scanner;

public class ColourApp {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select the first character of the chosen colour: B for BLUE, P for PURPLE, R for RED, Y for YELLOW, W for WHITE");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "B":
                    return "BLUE";
                case "P":
                    return "PURPLE";
                case "R":
                    return "RED";
                case "Y":
                    return "YELLOW";
                case "W":
                    return "WHITE";
                default:
                    System.out.println("Wrong character. Please try again.");
            }
        }
    }
}
