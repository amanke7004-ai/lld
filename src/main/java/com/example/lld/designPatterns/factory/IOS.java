package com.example.lld.designPatterns.factory;


import org.springframework.stereotype.Component;

@Component("IOS")
public class IOS implements  Platform{
    @Override
    public void boot() {
        System.out.println("Booting IOS Phone");
    }

    @Override
    public UIComponentFactory getUiComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
