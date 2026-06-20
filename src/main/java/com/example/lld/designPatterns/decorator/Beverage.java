package com.example.lld.designPatterns.decorator;

public abstract class Beverage {
    private String description;

    private int cost;

    public abstract void getDesc();

    public abstract int getCost();
}
