package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;

public class FindFlight {
    public void FindFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("New York", true);
        flightMap.put("Paris", true);
        flightMap.put("Warsaw", false);
        flightMap.put("Berlin", true);
        flightMap.put("Kopenhagen", true);

        if (flightMap.containsKey(flight.arrivalAirport)) {
            if (flightMap.get(flight.arrivalAirport)) {
                System.out.println("Flight Avilable");
            } else {
                System.out.println("Flight not Avilable");
            }

        } else {
            throw new RouteNotFoundException();
        }

    }


}
