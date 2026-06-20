package com.example.lld.designPatterns.decorator.addons;

import com.example.lld.designPatterns.decorator.AddOns;
import com.example.lld.designPatterns.decorator.Beverage;

public class Milk extends AddOns {

    private final Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Added Milk");
    }

    @Override
    public int getCost() {
        return 25 + this.beverage.getCost();
    }
}
