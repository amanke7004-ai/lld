package com.example.lld.decorator;

public class Ribbon extends AddOns{

    private final Gift gift;

    public Ribbon(Gift gift){
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return 5 + gift.getCost();
    }

    @Override
    public void getDescription() {
        gift.getDescription();
        System.out.println("Decorated with Ribbon");
    }
}
