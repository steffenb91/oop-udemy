package com.steffenboe.udemy.oop;

import java.time.LocalDateTime;

class Airplane extends Vehicle {

    Airplane(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location targetLocation) {
        if(!targetLocation.isAirport()){
            throw new IllegalStateException("Airplane needs airport to land");
        } else {
            // TODO
            return LocalDateTime.now();
        }
    }
    
}
