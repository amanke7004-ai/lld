package com.example.lld.designPatterns.factory;


import org.springframework.stereotype.Component;

@Component("ANDROID")
public class Android implements  Platform{
    @Override
    public void boot() {
        System.out.println("Booting Android phone");
    }

    @Override
    public UIComponentFactory getUiComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
