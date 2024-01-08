package com.steffenboe.udemy.oop.conceptual;

import java.time.LocalDateTime;

import com.steffenboe.udemy.oop.Location;

/**
 * Angenommen, wir klassifizieren nach maximaler Geschwindigkeit und aktuellem
 * Standort; daraus können wir die Ankunftszeit an einem beliebigen Standort für
 * jedes Fahrzeug berechnen;
 * egal ob Schiff, PKW oder Flugzeug
 */
abstract class Vehicle {

    protected double currentSpeed;
    protected Location currentLocation;

    Vehicle(double currentSpeed, Location currentLocation) {
        this.currentSpeed = currentSpeed;
        this.currentLocation = currentLocation;
    }

    abstract LocalDateTime estimatedTimeOfArrival(Location newLocation);

}
