package com.kodilla.exception.test;

public class ExceptionFlightRunner {
    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight = new Flight("New York", "Tokyo");
        FindFlight findFlight = new FindFlight();
        try {
            findFlight.FindFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);;
        } finally {
            System.out.println("Error RouteNotFoundException");
        }
    }
}


