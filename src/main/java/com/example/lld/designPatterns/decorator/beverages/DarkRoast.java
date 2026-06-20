package com.example.lld.designPatterns.decorator.beverages;

import com.example.lld.designPatterns.decorator.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public void getDesc() {
        System.out.println("DarkRoast");
    }

    @Override
    public int getCost() {
        return 300;
    }
}
