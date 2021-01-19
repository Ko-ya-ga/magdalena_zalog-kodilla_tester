package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal antoni = new Principal("Antoni", "Zientara");
        Principal andrew = new Principal("Andrew", "Boyd");
        Principal catherine = new Principal("Catherine", "Carrow");
        Principal heidi = new Principal("Heidi", "Werner");

        School poland = new School("Poland",27, 29, 24, 25, 28, 23);
        School usa = new School("USA",18, 24, 23, 19, 20, 22, 21);
        School uk = new School("UK",16, 20, 24, 18, 19, 20, 21, 22, 17);
        School germany = new School("Germany",22, 23, 22, 24, 25, 20, 21);

        schools.put(antoni, poland);
        schools.put(andrew, usa);
        schools.put(catherine, uk);
        schools.put(heidi, germany);

        for (Map.Entry<Principal, School> schoolsEntry : schools.entrySet()) {
            System.out.println("Overall number of students in school in " + schoolsEntry.getValue().getSchoolName() +
                    "lead by " + schoolsEntry.getKey().getFirstName() + " " + schoolsEntry.getKey().getLastName() +
                    " is " + schoolsEntry.getValue().getAllStudents());
        }
    }
}
