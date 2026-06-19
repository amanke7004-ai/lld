package com.example.lld.designPatterns.strategy;

public class ParkingLot {
    private ParkingStrategy parkingStrategy;

    public ParkingLot(ParkingStrategy parkingStrategy){
        this.parkingStrategy = parkingStrategy;
    }

    int parkVehicle(String vehicle){
        //do some business logic and allocate vehicle a parking spot and return that spot for ticket generation
        return parkingStrategy.allocateParkingSpot();
    }
}
