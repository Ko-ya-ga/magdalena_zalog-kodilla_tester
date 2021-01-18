package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Greece 1987", "43 mm x 31,25 mm", false));
        stamps.add(new Stamp("Yugoslavia 1948", "43 mm x 31,25 mm", true));
        stamps.add(new Stamp("Spain 1977", "43 mm x 31,25 mm", false));
        stamps.add(new Stamp("Notre Dame de Paris", "43 mm x 31,25 mm", false));
        stamps.add(new Stamp("Yugoslavia 1948", "43 mm x 31,25 mm", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
