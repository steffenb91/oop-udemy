package com.steffenboe.udemy.oop.conceptual;

import java.time.LocalDateTime;

import com.steffenboe.udemy.oop.Location;

class Ship extends Vehicle {

    Ship(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location newLocation) {
        if (newLocation.isPort()) {
            // TODO replace with actual calculation
            return LocalDateTime.now().plusDays(1);
        }
        throw new IllegalArgumentException("Ship needs a port to land");
    }

}
