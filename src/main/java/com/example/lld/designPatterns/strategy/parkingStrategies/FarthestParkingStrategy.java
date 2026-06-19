package com.example.lld.designPatterns.strategy.parkingStrategies;

import com.example.lld.designPatterns.strategy.ParkingStrategy;

public class FarthestParkingStrategy implements ParkingStrategy {
    @Override
    public int allocateParkingSpot() {
        //allocate some vacant farthest parking spot (may be due to some busy day or someone who wants to park for longer duration).
        return 76;
    }
}
