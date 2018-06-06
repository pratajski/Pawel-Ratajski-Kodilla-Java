package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Cracov", "Lodz");

        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);
            System.out.println("Flight is exist");
        } catch (RouteNotFoundException e) {
            System.out.println("Not found flight exception: " + e.getMessage());
        }
    }

}
