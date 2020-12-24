package com.kodilla;

public class GradesTest {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(3);
        grades.add(4);
        System.out.println(grades.returnLatestGrade());
        System.out.println(grades.gradesMean());
    }
}
