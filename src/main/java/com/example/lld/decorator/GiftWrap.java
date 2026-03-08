package com.example.lld.decorator;

public class GiftWrap extends  AddOns{

    private final Gift gift;

    public GiftWrap(Gift gift){
        this.gift = gift;
    }

    @Override
    public int getCost() {
        return 10 + gift.getCost();
    }

    @Override
    public void getDescription() {
        gift.getDescription();
        System.out.println("Decorated with Gift Wrap");
    }
}
