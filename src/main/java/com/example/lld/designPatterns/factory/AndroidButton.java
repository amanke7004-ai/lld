package com.example.lld.designPatterns.factory;

public class AndroidButton implements  Button{

    @Override
    public void clickButton() {
        System.out.println("Android Button clicked");
    }
}
