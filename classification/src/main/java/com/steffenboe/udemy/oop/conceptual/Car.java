package com.steffenboe.udemy.oop.conceptual;

import java.time.LocalDateTime;

import com.steffenboe.udemy.oop.Location;

class Car extends Vehicle {

    Car(double currentSpeed, Location currentLocation) {
        super(currentSpeed, currentLocation);
    }

    @Override
    LocalDateTime estimatedTimeOfArrival(Location newLocation) {
        // TODO replace with actual calculation
        return LocalDateTime.now().plusWeeks(1);
    }
    
}
