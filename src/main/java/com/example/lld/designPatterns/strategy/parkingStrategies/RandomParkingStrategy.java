package com.example.lld.designPatterns.strategy.parkingStrategies;

import com.example.lld.designPatterns.strategy.ParkingStrategy;

public class RandomParkingStrategy implements ParkingStrategy {
    @Override
    public int allocateParkingSpot() {
        return (int)(Math.random() * 200);
    }
}
