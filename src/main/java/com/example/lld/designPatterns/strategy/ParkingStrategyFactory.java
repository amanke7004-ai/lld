package com.example.lld.designPatterns.strategy;

import com.example.lld.designPatterns.strategy.parkingStrategies.FarthestParkingStrategy;
import com.example.lld.designPatterns.strategy.parkingStrategies.NearestParkingStrategy;
import com.example.lld.designPatterns.strategy.parkingStrategies.RandomParkingStrategy;

public class ParkingStrategyFactory {

    public static ParkingStrategy getParkingStrategyByName(String strategyName){
        if(strategyName.equalsIgnoreCase("nearest")){
            return new NearestParkingStrategy();
        }else if(strategyName.equalsIgnoreCase("farthest")){
            return new FarthestParkingStrategy();
        }
        return new RandomParkingStrategy();
    }
}
