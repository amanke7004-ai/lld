package com.example.lld.factory.buttons;

public class IosButton implements Button {
    @Override
    public void click() {
        System.out.println("Ios Button clicked");
    }
}
