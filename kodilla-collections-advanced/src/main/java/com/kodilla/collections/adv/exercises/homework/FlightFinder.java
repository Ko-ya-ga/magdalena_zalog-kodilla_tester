package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightFinder = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightFinder.getOrDefault(departure, Collections.emptyList()))
            if (flight.getDeparture().equals(departure))
                result.add(flight);
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightFinder.getOrDefault(arrival, Collections.emptyList()))
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        return result;
    }
}
