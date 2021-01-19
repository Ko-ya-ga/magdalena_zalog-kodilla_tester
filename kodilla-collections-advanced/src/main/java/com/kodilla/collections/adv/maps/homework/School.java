package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(String schoolName, int... studentsInClasses) {
        this.schoolName = schoolName;
        for (int classes : studentsInClasses)
            this.studentsInClasses.add(classes);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAllStudents() {
        int sum = 0;
        for (int classes : studentsInClasses)
            sum += classes;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsInClasses=" + studentsInClasses +
                '}';
    }
}
