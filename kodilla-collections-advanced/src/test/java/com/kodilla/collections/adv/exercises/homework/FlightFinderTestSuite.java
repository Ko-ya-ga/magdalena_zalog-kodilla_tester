package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Melbourne, Australia";
        // when
        List<Flight> result = flightFinder.findFlightsFrom(departure);
        // then
        List <Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Melbourne, Australia", "New York, USA"));
        expectedList.add(new Flight("Melbourne, Australia", "Newcastle, UK"));
        assertEquals(expectedList, result);
    }
}