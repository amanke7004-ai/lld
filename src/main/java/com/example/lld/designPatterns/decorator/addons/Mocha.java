package com.example.lld.designPatterns.decorator.addons;

import com.example.lld.designPatterns.decorator.AddOns;
import com.example.lld.designPatterns.decorator.Beverage;

public class Mocha extends AddOns {

    private final Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Added Mocha");
    }

    @Override
    public int getCost() {
        return 50 + this.beverage.getCost();
    }
}
