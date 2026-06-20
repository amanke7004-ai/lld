package com.example.lld.designPatterns.decorator;

import com.example.lld.designPatterns.decorator.addons.Milk;
import com.example.lld.designPatterns.decorator.addons.Mocha;
import com.example.lld.designPatterns.decorator.addons.Whip;
import com.example.lld.designPatterns.decorator.beverages.Espresso;
import com.example.lld.designPatterns.decorator.beverages.HouseBlend;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.getDesc();;
        System.out.println("Cost :: " + espresso.getCost());

        Beverage beverage =  new HouseBlend();
        beverage.getDesc();;
        System.out.println("Cost :: " + beverage.getCost());
        beverage = new Milk(beverage);
        beverage.getDesc();;
        System.out.println("Cost :: " + beverage.getCost());

        // Add double Mocha with whip with the HouseBlend with Milk
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage.getDesc();;
        System.out.println("Cost :: " + beverage.getCost());

    }
}
