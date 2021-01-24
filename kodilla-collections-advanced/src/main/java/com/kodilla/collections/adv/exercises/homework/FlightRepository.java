package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Katowice, Poland", "Oslo Torp, Norway"));
        flightsTable.add(new Flight("Komatsu, Japan", "Vienna, Austria"));
        flightsTable.add((new Flight("Melbourne, Australia", "New York, USA")));
        flightsTable.add(new Flight("Malaga, Spain", "New York, USA"));
        flightsTable.add((new Flight("Katowice, Poland", "Thessaloniki, Greece")));
        flightsTable.add(new Flight("Melbourne, Australia", "Newcastle, UK"));
        return flightsTable;
    }
}
