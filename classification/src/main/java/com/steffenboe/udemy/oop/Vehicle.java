package com.steffenboe.udemy.oop;

import java.time.LocalDateTime;

class Vehicle {

    private double currentSpeed;
    private Location currentLocation;
    private LocationType validTargetLocationType;

    Vehicle(double currentSpeed, Location currentLocation, LocationType validTargetLocationType){
        this.currentSpeed = currentSpeed;
        this.currentLocation = currentLocation;
        this.validTargetLocationType = validTargetLocationType;
    }

    LocalDateTime estimatedTimeOfArrival(Location targetLocation){
        if(!targetLocation.type().equals(validTargetLocationType)){
            throw new IllegalArgumentException("Invalid target location type");
        }
        return LocalDateTime.now();
    }
}
