package com.example.lld.designPatterns.decorator.addons;

import com.example.lld.designPatterns.decorator.AddOns;
import com.example.lld.designPatterns.decorator.Beverage;

public class Whip extends AddOns {

    private final Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Added Whip");
    }

    @Override
    public int getCost() {
        return 70 + this.beverage.getCost();
    }
}
