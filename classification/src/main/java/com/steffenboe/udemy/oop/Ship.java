package com.steffenboe.udemy.oop;

import java.time.LocalDateTime;

class Ship extends Vehicle {

    Ship(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location targetLocation) {
        if (targetLocation.isPort()) {
            // TODO calc
            return LocalDateTime.now();
        } else {
            throw new IllegalArgumentException("Ship needs a port to land");
        }
    }

}
