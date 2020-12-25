package com.kodilla;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int result = 0;
        int sum = 0;
        int min = 0;
        int max = 30;
        while (sum < 5001) {
            int temp = r.nextInt(31);
            sum = sum + temp;
            result++;
            if (temp >= max) {
                max = temp;
                System.out.println("Max random is" + " " + max);
            }
            if (temp <= min) {
                min = temp;
                System.out.println("Min random is" + " " + min);
            }
        }
        System.out.println(result);
    }
}
