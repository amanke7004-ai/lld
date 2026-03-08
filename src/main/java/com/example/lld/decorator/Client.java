package com.example.lld.decorator;

public class Client {
    public static void main(String[] args) {
        Gift gift = new Car();
        gift.getDescription();
        System.out.println(gift.getCost());


        //adding gift wrap as add-on
        gift = new GiftWrap(gift);
        gift.getDescription();
        System.out.println(gift.getCost());


        //adding ribbon and nameplates as add-ons
        gift = new Ribbon(gift);
        gift = new NamePlate(gift);
        gift.getDescription();
        System.out.println(gift.getCost());

        //NOTE: After all add-ons Gift is still gift, no code changes required. Because, the Add-ons is also extending Gift. and the actual gift is still gift.



    }
}
