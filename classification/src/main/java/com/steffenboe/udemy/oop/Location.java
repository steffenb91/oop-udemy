package com.steffenboe.udemy.oop;

public record Location(double altitude, double longitude, LocationType type) {

    public boolean isAirport() {
        return LocationType.AIRPORT.equals(type);
    }

    public boolean isPort() {
        return LocationType.PORT.equals(type);
    }

}
