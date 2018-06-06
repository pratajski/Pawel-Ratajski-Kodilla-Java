package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Gdansk", false);

        Boolean isFlight = flightMap.get(flight.arrivalAirport);

        if(isFlight == null) {
            throw new RouteNotFoundException();
        }

    }
}
