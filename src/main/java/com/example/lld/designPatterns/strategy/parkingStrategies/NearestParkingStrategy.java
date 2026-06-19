package com.example.lld.designPatterns.strategy.parkingStrategies;

import com.example.lld.designPatterns.strategy.ParkingStrategy;

public class NearestParkingStrategy implements ParkingStrategy {
    @Override
    public int allocateParkingSpot() {
        //allocate some vacant nearest parking spot
        return 2;
    }
}
