package com.example.lld.designPatterns.decorator.beverages;

import com.example.lld.designPatterns.decorator.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public void getDesc() {
        System.out.println("HouseBlend");
    }

    @Override
    public int getCost() {
        return 200;
    }
}
