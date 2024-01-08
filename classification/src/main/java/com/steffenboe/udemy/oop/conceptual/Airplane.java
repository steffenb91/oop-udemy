package com.steffenboe.udemy.oop.conceptual;

import java.time.LocalDateTime;

import com.steffenboe.udemy.oop.Location;

class Airplane extends Vehicle {

    Airplane(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location newLocation) {
        if (newLocation.isAirport()) {
            // TODO replace with actual calculation
            return LocalDateTime.now().plusHours(1);
        }
        throw new IllegalArgumentException("Airplane needs an airport to land");
    }

}
