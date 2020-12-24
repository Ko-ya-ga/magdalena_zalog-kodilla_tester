package com.kodilla;

public class Grades {
    public int[] grades = new int[10];
    public int size = 0;
    public void add(int value) {
        if (size == 10) {
            return;
        }
        grades[size] = value;
        size++;
    }
    public int returnLatestGrade() {

        return grades[size - 1];
    }

    public double gradesMean() {
        int sum = 0;
        for (int n = 0; n < size; n++) {
            sum += grades[n];
        }
        double calculatedMean = sum / size;
        return calculatedMean;
    }
}
