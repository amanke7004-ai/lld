package com.example.lld.decorator;

public class NamePlate extends AddOns{

    private final Gift gift;

    public NamePlate(Gift gift){
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return 2 + gift.getCost();
    }

    @Override
    public void getDescription() {
        gift.getDescription();
        System.out.println("Decorated with Name Plate");
    }
}
