package com.example.lld.designPatterns.decorator.beverages;

import com.example.lld.designPatterns.decorator.Beverage;

public class Espresso extends Beverage {

    @Override
    public void getDesc() {
        System.out.println("Espresso");
    }

    @Override
    public int getCost() {
        return 250;
    }
}
