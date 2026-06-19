package com.example.lld.designPatterns.factory;

public class IOSButton implements  Button{
    @Override
    public void clickButton() {
        System.out.println("IOS Button clicked");
    }
}
