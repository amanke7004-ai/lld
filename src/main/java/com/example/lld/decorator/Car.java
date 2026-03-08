package com.example.lld.decorator;

public class Car extends Gift{
    @Override
    public int getCost() {
        return 250;
    }

    @Override
    public void getDescription() {
        System.out.println("Car");
    }
}
