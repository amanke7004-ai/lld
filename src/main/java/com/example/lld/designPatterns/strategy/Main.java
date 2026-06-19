package com.example.lld.designPatterns.strategy;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Select any one of the parking strategy to park vehicle \n-NEAREST \n-FARTHEST \n-RANDOM");

        String strategyName = new Scanner(System.in).nextLine();
        ParkingStrategy parkingStrategy = ParkingStrategyFactory.getParkingStrategyByName(strategyName);
        ParkingLot parkingLot = new ParkingLot(parkingStrategy);
        int parkingSpotNum = parkingLot.parkVehicle("DL10CD4991");
        System.out.println("Park your vehicle at :: " + parkingSpotNum);
    }
}
