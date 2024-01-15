package com.steffenboe.udemy.oop;

import java.time.LocalDateTime;

class Car extends Vehicle {

    Car(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location targetLocation) {
        // TODO
        return LocalDateTime.now();
    }

    
}
