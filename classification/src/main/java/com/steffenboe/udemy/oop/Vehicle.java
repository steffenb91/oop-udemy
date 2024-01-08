package com.steffenboe.udemy.oop;

import java.time.LocalDateTime;

/**
 * Angenommen, wir klassifizieren nach maximaler Geschwindigkeit und aktuellem
 * Standort; daraus können wir die Ankunftszeit an einem beliebigen Standort für
 * jedes Fahrzeug berechnen;
 * egal ob Schiff, PKW oder Flugzeug
 */
class Vehicle {

    private double maxSpeed;
    private Location currentLocation;

    Vehicle(double maxSpeed, Location currentLocation) {
        this.maxSpeed = maxSpeed;
        this.currentLocation = currentLocation;
    }

    LocalDateTime estimatedTimeOfArrival(Location newLocation) {
        // travel to location
        return LocalDateTime.now().plusDays(1);
    }

}
