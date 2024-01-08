package com.steffenboe.udemy.oop.classical;

import java.time.LocalDateTime;

import com.steffenboe.udemy.oop.Location;
import com.steffenboe.udemy.oop.LocationType;

class Vehicle {

    private double currentSpeed;
    private Location currentLocation;

    private LocationType validTargetType;

    Vehicle(double currentSpeed, Location currentLocation, LocationType validTarget) {
        this.currentSpeed = currentSpeed;
        this.currentLocation = currentLocation;
        this.validTargetType = validTarget;
    }

    LocalDateTime estimatedTimeOfArrival(Location newLocation) {
        if (!newLocation.type().equals(validTargetType)) {
            throw new IllegalArgumentException("Vehicle can only travel to " + validTargetType);
        }
        // TODO replace with actual calculation
        return LocalDateTime.now().plusDays(1);
    }
}
